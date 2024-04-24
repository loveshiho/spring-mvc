package com.akai.controller;

import com.akai.pojo.User;
import com.akai.service.UserService;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class DataController {
    @Autowired
    private UserService userService;

    /*定义一个处理单元，向三个域中放入数据*/
    /*
     * request,session 这两个域直接放在参数列表上即可,SpringMVC就可以给我们注入
     * ServletContext对象(application域) 不能直接放在参数列表上的
     * */
    @RequestMapping("/setData")
    public String setData(HttpServletRequest req, HttpSession session) {
        List<User> all = userService.findAll();
        /*向三个域中放入数据*/
        req.setAttribute("msg", "halo req");
        req.setAttribute("users", all);

        session.setAttribute("msg", "halo session");
        session.setAttribute("users", all);

        ServletContext application = req.getServletContext();
        application.setAttribute("msg", "halo application");
        application.setAttribute("users", all);
        return "show.jsp";
    }

    /*model对象addAttribute
     * 主要是对请求域传递数据进行了API上的封装
     * 降低controller和Servlet之间的耦合度
     * 重定向下,没法使用model传递域中的数据
     * model中字符串类型的键值对信息,会转换为请求参数,转发给目标组件
     * */
    @RequestMapping("/testModel")
    public String testModel(Model model) {
        List<User> all = userService.findAll();
        /*添加数据*/
        model.addAttribute("msg", "halo req");
        model.addAttribute("users", all);
        return "show.jsp";
    }

    /*
     * ModelAndView
     * Model数据
     * View 视图
     * */
    @RequestMapping("testMV")
    public ModelAndView testMV() {
        ModelAndView mv = new ModelAndView();
        Map<String, Object> model = mv.getModel();  // 只是名字叫model,和Model对象并无关系
        // 向request域中放入数据
        List<User> users = userService.findAll();
        model.put("msg", "halo req");
        model.put("users", users);
        // 设置视图
        mv.setViewName("show.jsp");
        return mv;
    }
}

package com.akai.controller;

import com.akai.pojo.User;
import com.akai.service.UserService;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
}

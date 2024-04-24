package com.akai.controller;

import com.akai.pojo.User;
import com.akai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ModelAndView login(@RequestParam("name") String name, @RequestParam("password") String password) {
        ModelAndView mv = new ModelAndView();
        Map<String, Object> model = mv.getModel();
        /*向request域中存入数据*/
        model.put("msg", "傻逼");
        User user = userService.findUser(name, password);
        if (user == null) {
            mv.setViewName("fail.jsp");
        } else {
            mv.setViewName("success.jsp");
        }
        return mv;
    }

    @ResponseBody
    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody(required = false) User user) {
        System.out.println(user);
        return "success.jsp";
    }
}


package com.akai.controller;

import com.akai.pojo.User;
import com.akai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(@RequestParam("name") String name, @RequestParam("password") String password) {
        String view = "";
        User user = userService.findUser(name, password);
        view = null == user ? "fail.jsp" : "success.jsp";
        return view;
    }

    @ResponseBody
    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }
}


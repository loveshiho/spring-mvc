package com.akai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionController {
    @RequestMapping("/testNumException")
    public String testNumException() {
        int i = 1 / 0;
        return "success.jsp";
    }
    @RequestMapping("/testNullException")
    public String testNullException() {
        String s = null;
        System.out.println(s.length());
        return "success.jsp";
    }
}

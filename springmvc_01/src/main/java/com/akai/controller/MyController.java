package com.akai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // 交给spring实例化
public class MyController {
    // 定义一个处理请求的方法
    /*
    * 返回定义为spring,用来表明要跳转的资源路径
    * */
    @RequestMapping("/first") // request:请求,mapping:映射,表示你在请求的时候,用什么路径能够映射到这个方法
    public String firstController() {
        System.out.println("hello controller");
        return "hello.jsp";
    }
    @RequestMapping("/nihao")
    public String nihaoController() {
        System.out.println("nihao controller");
        // return "/WEB-INF/view/nihao.jsp";
        return "nihao";
    }
    @RequestMapping(value = {"/hi", "/haha"})
    public void hiController() {
        System.out.println("ha ha");
    }
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void testRequest() {
        System.out.println("ni hao");
    }
    @RequestMapping(value = "/test2", method = RequestMethod.GET, params = {"username=root", "password"})
    public String testRequest2() {
        System.out.println("loveshiho");
        return "nihao";
    }
}

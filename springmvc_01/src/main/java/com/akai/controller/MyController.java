package com.akai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}

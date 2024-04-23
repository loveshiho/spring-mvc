package com.akai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResponseController {
    @RequestMapping("/testVoid")
    public void testVoid() {
        System.out.println("void controller");
        // void controller,实际上是执行了,只不过是要跳转的资源没找到,或者说不知道往哪跳,所以是会报错的
    }
}

package com.akai.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParamsController {
    /*
    * 紧耦合方式注入参数
    * 使用传统的 HttpServletRequest对象获取参数
    * */
    @RequestMapping("/getParamByReq")
    public String getParam1(HttpServletRequest req) {
        String username = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        System.out.println(username + " : " + pwd);
        return "nice~";
    }
    /*
    * 解耦合方式注入参数
    * 通过springMVC框架功能，自动转换参数
    * 处理单元参数列表中参数名必须和请求中的参数名一致
    * 上面规则现在用不了,但没关系,加个 @RequestParam注解,灵活方便
    * */
    @RequestMapping("/getParamNoReq")
    public String getParam2(@RequestParam("username") String username,@RequestParam("pwd") String pwd) {
        System.out.println(username + " : " + pwd);
        return "nice~";
    }
}

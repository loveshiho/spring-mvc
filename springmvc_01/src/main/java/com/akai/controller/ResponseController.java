package com.akai.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class ResponseController {
    @RequestMapping("/testVoid")
    public void testVoid() {
        System.out.println("void controller");
        // void controller,实际上是执行了,只不过是要跳转的资源没找到,或者说不知道往哪跳,所以是会报错的
    }
    @RequestMapping("/testForWard")
    public void testForWard(HttpServletRequest req, HttpServletResponse resp) {
        try {
            req.getRequestDispatcher("forward.jsp").forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
    @RequestMapping("/testRedirect")
    public void testRedirect(HttpServletResponse resp) {
        try {
            resp.sendRedirect("redirect.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

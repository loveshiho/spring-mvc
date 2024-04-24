package com.akai.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /*在请求到达我们定义的handler之前工作的*/
        /*handler就是controller*/
        /*如果返回true:代表放行*/
        /*如果返回false:代表不放行*/
        System.out.println("preHandle invoked~");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        /*handler处理单元返回 ModelAndView时进行拦截*/
        System.out.println("postHandle invoked~");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        /*页面渲染完毕 但是还没有给浏览器响应数据时*/
        System.out.println("afterCompletion invoked~");
    }
}

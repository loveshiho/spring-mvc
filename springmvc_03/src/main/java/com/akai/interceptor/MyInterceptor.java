package com.akai.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

public class MyInterceptor implements HandlerInterceptor {
    /**
     * @param request  请求对象
     * @param response 响应对象
     * @param handler  目标要调用的Handler
     * @return 返回true放行, 返回false拦截
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /*在请求到达我们定义的handler之前工作的*/
        /*handler就是controller*/
        /*如果返回true:代表放行*/
        /*如果返回false:代表不放行*/

        /*post请求编码处理*/
        /*设置请求和响应的乱码*/
        /* request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");*/

        // 判断是否登录
        /* User user =(User) request.getSession().getAttribute("user");
        if(null == user)
            response.sendRedirect("index.jsp");
        return false;*/
        return true;
    }

    /**
     * @param request
     * @param response
     * @param handler
     * @param modelAndView controller响应的结果,视图和数据
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        /*handler处理单元返回 ModelAndView时进行拦截*/
        /*控制数据*/
        Map<String, Object> model = modelAndView.getModel();
        String s = (String) model.get("msg");
        String replaced = s.replaceAll("傻逼", "**");
        model.put("msg", replaced);
        /*控制视图*/
        // modelAndView.setViewName("fail.jsp");
    }

    /**
     * 无论controller是否出现异常,都会执行的方法
     * 一般来说都做一些资源释放工作
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        /*页面渲染完毕 但是还没有给浏览器响应数据时*/
    }
}

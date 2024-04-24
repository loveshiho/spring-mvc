package com.akai.exceptionhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GloableExceptionHandler {
    @ExceptionHandler(value = {ArithmeticException.class, NullPointerException.class})
    public ModelAndView handleException() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("exception.jsp");
        return mv;
    }
}

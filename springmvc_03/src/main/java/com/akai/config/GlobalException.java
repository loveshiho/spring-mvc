package com.akai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

/**
 * 全局异常
 */
@Configuration
public class GlobalException {
    @Bean
    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver() {
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
        Properties prop = new Properties();
        prop.put("java.lang.ArithmeticException", "exception.jsp");
        prop.put("java.lang.NullPointerException", "exception.jsp");
        resolver.setExceptionMappings(prop);
        return resolver;
    }
}

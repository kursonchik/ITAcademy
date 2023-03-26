package com.example.bootcamp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author : Volha Salash
 */
@Configuration
@ComponentScan(basePackages = "com.example.bootcamp")
public class WebConfig implements WebMvcConfigurer {

    public WebConfig(GlobalHandler globalHandler) {
        this.globalHandler = globalHandler;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(globalHandler).addPathPatterns("/**");
    }

    private final GlobalHandler globalHandler;
}
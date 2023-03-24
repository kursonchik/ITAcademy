package com.example.bootcamp.config;

import com.example.bootcamp.service.interfaces.UserService;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author : Volha Salash
 */
@Component
public class GlobalHandler implements HandlerInterceptor {

    public GlobalHandler(UserService userService) {
    }
}

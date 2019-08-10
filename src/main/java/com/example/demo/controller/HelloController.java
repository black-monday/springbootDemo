package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: demo
 * @description: springbootDemo
 * @author: wangyuebo
 * @create: 2019-07-25 18:09
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String index(HttpServletRequest request, @RequestParam(value = "name", required = false, defaultValue = "springboot-thymeleaf")
            String name){
        request.setAttribute("name", name);
        return "hello";
    }


}

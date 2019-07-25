package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description: springbootDemo
 * @author: wangyuebo
 * @create: 2019-07-25 18:09
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "hello,world";
    }


}

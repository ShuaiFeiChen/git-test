package com.atguigu.springredis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }

}

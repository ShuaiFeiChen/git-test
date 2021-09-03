package com.atguigu.hello.controller;

import com.atguigu.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Value("${spring.mvc.format.date-time:yyyy-MM-dd HH:mm:ss}")
    private String dateTimeFormate;

    @Resource
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(String userName){
        System.out.println(dateTimeFormate);
        return helloService.sayHello(userName);
    }

    @GetMapping(value = "/hello2")
    public String hello2(){
        //hello the world
        //test from remote add
        return "hello2";
    }

}

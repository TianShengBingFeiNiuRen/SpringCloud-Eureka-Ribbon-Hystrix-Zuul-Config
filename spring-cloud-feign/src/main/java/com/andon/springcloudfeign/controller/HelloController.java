package com.andon.springcloudfeign.controller;

import com.andon.springcloudfeign.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @GetMapping(value = "/hello")
    public String hello(String name){
        return helloService.hello(name);
    }
}

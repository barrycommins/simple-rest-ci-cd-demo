package com.barrycommins.simplerest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.barrycommins.simplerest.service.HelloService;

@RestController("/hello")
public class HelloController {
    
    private HelloService helloService;
    
    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }
    
    @RequestMapping
    public String getGreeting(@RequestParam(name="name", required=true) String name) {
        return helloService.greeting() + ", " + name;
    }

}

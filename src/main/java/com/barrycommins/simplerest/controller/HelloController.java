package com.barrycommins.simplerest.controller;


import com.barrycommins.simplerest.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloController {
    
    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping
    public String getGreeting(@RequestParam(name="name") String name) {

        return helloService.greeting() + ", " + name;
    }

}

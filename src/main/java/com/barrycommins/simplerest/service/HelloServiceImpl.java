package com.barrycommins.simplerest.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String greeting() {
        return "Hello";
    }

}

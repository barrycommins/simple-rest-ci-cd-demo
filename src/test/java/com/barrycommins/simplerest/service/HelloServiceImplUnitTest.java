package com.barrycommins.simplerest.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloServiceImplUnitTest {
    
    private HelloService helloService = new HelloServiceImpl();
    

    @Test
    public void test() {
        assertEquals("Hello", helloService.greeting());
    }

}

package com.barrycommins.simplerest.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloServiceImplUnitTest {
    
    @Test
    public void test() {
        HelloService helloService = new HelloServiceImpl();
        assertEquals("Hello", helloService.greeting());
    }

}

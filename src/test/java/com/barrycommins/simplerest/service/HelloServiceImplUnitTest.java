package com.barrycommins.simplerest.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloServiceImplUnitTest {

    @Test
    public void test() {
        HelloService helloService = new HelloServiceImpl();
        assertEquals("Hello", helloService.greeting());
    }
}

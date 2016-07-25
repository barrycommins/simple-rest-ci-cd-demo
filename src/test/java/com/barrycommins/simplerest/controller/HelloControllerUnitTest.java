package com.barrycommins.simplerest.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import com.barrycommins.simplerest.service.HelloService;

public class HelloControllerUnitTest {
    
    private static final String GREETING = "Hello";
    
    private HelloController helloController;
    
    private HelloService helloService;

    @Before
    public void setUpBefore() throws Exception {
        helloService = mock(HelloService.class);
        when(helloService.greeting()).thenReturn(GREETING);
        helloController = new HelloController(helloService);
    }

    @Test
    public void test() {
        String name = "test";
        assertEquals(GREETING + ", "+name, helloController.getGreeting(name));
    }

}

package com.barrycommins.simplerest.controller;

import com.barrycommins.simplerest.service.HelloService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HelloControllerUnitTest {
    
    private static final String GREETING = "Hello";
    
    private HelloController helloController;

    @Before
    public void setUpBefore() throws Exception {
        HelloService helloService = mock(HelloService.class);
        when(helloService.greeting()).thenReturn(GREETING);
        helloController = new HelloController(helloService);
    }

    @Test
    public void test() {
        String name = "test";
        assertEquals(GREETING + ", "+name, helloController.getGreeting(name));
    }

}

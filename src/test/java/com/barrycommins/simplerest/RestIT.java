package com.barrycommins.simplerest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SimpleRestCiCdDemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestIT {
    
    @Value("${local.server.port}")
    private String serverPort;

	@Test
	public void testGreeting() {
	    TestRestTemplate restTemplate = new TestRestTemplate();
	    
	    String response = restTemplate.getForObject("http://localhost:"+serverPort+"/hello?name=test", String.class);
        assertEquals("Hello, test", response);
	}

}

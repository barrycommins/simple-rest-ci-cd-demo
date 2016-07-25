package com.barrycommins.simplerest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SimpleRestCiCdDemoApplication.class)
@WebIntegrationTest(randomPort=true) 
public class SimpleRestCiCdDemoApplicationTests {
    
    @Value("${local.server.port}")
    private String serverPort;

	@Test
	public void testGreeting() {
	    
	    TestRestTemplate restTemplate = new TestRestTemplate();
	    
	    String response = restTemplate.getForObject("http://localhost:"+serverPort+"/hello?name=test", String.class);
	    assertEquals("Hello, test", response);
	}

}

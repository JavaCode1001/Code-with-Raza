package com.soft.infg;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class Javamsapart1demo001ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testVanillaService() {
		RestTemplate restTemplate = new RestTemplate();
		String message = restTemplate.getForObject("http://localhost:8282", String.class);
		Assertions.assertEquals("Hello from rest !", message);
	}
}

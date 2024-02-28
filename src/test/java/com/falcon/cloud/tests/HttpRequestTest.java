package com.falcon.cloud.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate testRestTemplate;
	
	@Test
	void homePageShouldReturnDefaultMessage() {
		System.out.println("In homePageShouldReturnDefaultMessage() method");
		assertThat(this.testRestTemplate.getForObject("http://localhost:" + port, String.class)).contains("Java AWS Deploy with Spring Test!!!...");
	}
}

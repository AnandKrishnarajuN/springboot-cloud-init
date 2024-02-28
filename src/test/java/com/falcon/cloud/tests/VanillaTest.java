package com.falcon.cloud.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.falcon.cloud.controller.DeployController;


@SpringBootTest
public class VanillaTest {

	@Autowired
	private DeployController deployController;
	
	@Test
	void contextLoads() throws Exception{
		assertThat(deployController).isNotNull();
	}
}

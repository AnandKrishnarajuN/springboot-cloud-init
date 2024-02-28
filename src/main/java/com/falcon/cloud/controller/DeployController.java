package com.falcon.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployController {

	@GetMapping("/")
	public String home() {
		return "Java Cloud Deploy with Spring Test!!!...";
	}
}

package com.example.sclapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/student")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}

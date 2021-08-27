package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// https://dzone.com/articles/bounty-spring-boot-and-postgresql-database

@RestController
public class HelloController {

	@GetMapping("/")
	public void index(HttpServletResponse httpServletResponse) throws IOException {
		httpServletResponse.sendRedirect("index.html");
	}

	@GetMapping("/health")
	public String health() {
		return "Greetings from Spring Boot!";
	}

}

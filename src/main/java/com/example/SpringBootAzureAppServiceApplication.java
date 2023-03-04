package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAzureAppServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAzureAppServiceApplication.class, args);
	}
	
	@GetMapping("/message")
	public String getMeaage() {
		return "Welcome to Spring Boot Azure Function Application..";
	}

}

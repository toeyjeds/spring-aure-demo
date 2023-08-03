package com.demo.springapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringapplicationApplication {

	@GetMapping("/message")
	public String message(){
		return "Spring Azure Demo Application deployed successfully in Azure!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringapplicationApplication.class, args);
	}

}

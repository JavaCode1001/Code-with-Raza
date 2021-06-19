package com.soft.infg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Javamsapart1demo001Application {

	public static void main(String[] args) {
		SpringApplication.run(Javamsapart1demo001Application.class, args);
	}

	@RequestMapping("/")
	public String sayHell() {
		return "Hello from rest !";
	}
}

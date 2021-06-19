package com.soft.infg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.soft.infg.component.Sender;

@SpringBootApplication
public class Javamsapart1demo003Application implements CommandLineRunner {

	@Autowired
	Sender sender;

	public static void main(String[] args) {
		SpringApplication.run(Javamsapart1demo003Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		sender.send("Hello message from my App!");

	}

}

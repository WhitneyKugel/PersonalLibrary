package com.whitneykugel.PersonalLibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PersonalLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalLibraryApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return "Hello World!";
	}
}

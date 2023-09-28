package com.acoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.validation.constraints.Email;

@SpringBootApplication
@Email
public class EmailSenderAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailSenderAppApplication.class, args);
	}

}

package com.example.apidury;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class ApiDuryApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiDuryApplication.class, args);

	}
}

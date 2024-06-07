package com.projectSample.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MyBoardApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyBoardApplication.class, args);
	}
}

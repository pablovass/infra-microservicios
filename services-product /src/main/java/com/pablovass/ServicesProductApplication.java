package com.pablovass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class ServicesProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesProductApplication.class, args);
	}

}

package com.natural;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication
public class MockSmartcareApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockSmartcareApplication.class, args);
	}

}

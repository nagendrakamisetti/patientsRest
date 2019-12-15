package com.nagendra.restws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.nagendra.restws"})
public class RestwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestwsApplication.class, args);
	}

}

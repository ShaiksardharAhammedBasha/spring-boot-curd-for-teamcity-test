package com.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAppWithCrudApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(SpringAppWithCrudApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringAppWithCrudApplication.class, args);
		logger.info("in main class");
	}

}

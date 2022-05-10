package com.sgenlecroyant.springboot.simplecaching;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSimpleCachingApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringBootSimpleCachingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSimpleCachingApplication.class, args);
		
		logger.info("Spring Boot Simple Caching Up and Running");
		System.out.println("Updating ...");
	
	}

}

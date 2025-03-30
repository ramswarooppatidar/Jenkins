package com.example.jenkins;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsApplication {
	private static Logger logger = (Logger)LoggerFactory.getLogger(JenkinsApplication.class);

	@PostConstruct
	public void init() {
		logger.info("application is started !...*******************************************************************************************************************************************************************************************");
	}
	public static void main(String[] args) {
		logger.info("application is executed");
		System.out.println("print stetments");
		SpringApplication.run(JenkinsApplication.class, args);
		logger.info("application is executed in side main ....!");
	}

}

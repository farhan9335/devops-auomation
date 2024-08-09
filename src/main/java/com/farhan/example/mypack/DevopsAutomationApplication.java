package com.farhan.example.mypack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsAutomationApplication {

	public static Logger logger = LoggerFactory.getLogger(DevopsAutomationApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DevopsAutomationApplication.class, args);
	}

	@GetMapping("/message")
	public String getMessage() {
		logger.info("<==========Started to execute endpoint===========>");
		return "Welcome, you have successfully configured CI/CD";
	}

}

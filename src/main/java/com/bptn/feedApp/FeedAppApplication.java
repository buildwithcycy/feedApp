package com.bptn.feedApp;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@EnableAsync
@SpringBootApplication
//This is where the dependency injection takes place. 
//It injects all the dependencies that are needed for the application to run. 
//It also scans for components, configurations, and services in the com.bptn.feedApp package and its sub-packages.
public class FeedAppApplication {

	public static void main(String[] args) {
		//This is the entry point of the application. 
		//It starts the Spring Boot application by calling the run method of the SpringApplication class.
		SpringApplication.run(FeedAppApplication.class, args);
	}

}

package com.traini8.trainingcenterregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
// import org.springframework.context.annotation.ComponentScan;

// @SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
// @ComponentScan(basePackages = "com.traini8.trainingcenterregistry.handler")
public class TrainingCenterRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingCenterRegistryApplication.class, args);
	}

}

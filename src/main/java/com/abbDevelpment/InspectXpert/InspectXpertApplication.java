package com.abbDevelpment.InspectXpert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.abbDevelpment.InspectXpert")
@EntityScan(basePackages = "com.abbDevelpment.InspectXpert.model")
public class InspectXpertApplication {

	public static void main(String[] args) {
		SpringApplication.run(InspectXpertApplication.class, args);
	}
}

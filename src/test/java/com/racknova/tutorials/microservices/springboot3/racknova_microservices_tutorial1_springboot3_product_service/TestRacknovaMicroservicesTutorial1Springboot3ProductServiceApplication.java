package com.racknova.tutorials.microservices.springboot3.racknova_microservices_tutorial1_springboot3_product_service;

import org.springframework.boot.SpringApplication;

public class TestRacknovaMicroservicesTutorial1Springboot3ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(RacknovaMicroservicesTutorial1Springboot3ProductServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

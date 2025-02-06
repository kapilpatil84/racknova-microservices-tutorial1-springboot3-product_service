package com.racknova.tutorials.microservices.springboot3.racknova_microservices_tutorial1_springboot3_product_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class RacknovaMicroservicesTutorial1Springboot3ProductServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}

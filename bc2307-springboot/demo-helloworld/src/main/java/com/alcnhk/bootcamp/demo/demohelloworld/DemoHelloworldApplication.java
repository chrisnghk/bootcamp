package com.alcnhk.bootcamp.demo.demohelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @Configuration
// EnableAutoConfiguration 
// ComponentScan ( Most Important)
// ComponentScan is to scan @Contrioller , @Service, @Repository, @Configuartion
// if yes, create an object of those classes
// and put that object into SpringContext
public class DemoHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoHelloworldApplication.class, args);
	}

}

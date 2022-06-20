package com.zensar;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.ModelMap;

@SpringBootApplication
@ComponentScan(basePackages = { "test", "com.zensar" })
public class SpringBootProductApplication {

	public static void main(String[] args) {
		System.out.println("Ram");

		SpringApplication.run(SpringBootProductApplication.class, args);

		System.out.println("Laxman");

	}

	@Bean
	public ModelMap getModelMapper() {

		return new ModelMap();
	}

}

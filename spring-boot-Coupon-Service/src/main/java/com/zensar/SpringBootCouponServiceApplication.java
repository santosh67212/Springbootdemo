package com.zensar;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"test","com.zensar"})
public class SpringBootCouponServiceApplication {

	public static void main(String[] args) {
		System.out.println("Bheem");
		SpringApplication.run(SpringBootCouponServiceApplication.class, args);
		System.out.println("Krishna");
	}

}

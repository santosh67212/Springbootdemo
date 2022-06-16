package com.zensar.spring.boot.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class MyCommandLineRunner implements CommandLineRunner{

	


	
	@Override
	public void run(String...strings ) throws Exception{
		
		
		System.out.println("MyCommandLineRunner2 "+Arrays.toString(args));
	}
	
}

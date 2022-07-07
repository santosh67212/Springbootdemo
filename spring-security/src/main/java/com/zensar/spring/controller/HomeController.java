package com.zensar.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	// http://localhost:9090/

	@GetMapping("/all")
	public String sayHello() {

		return "<h1> Hello..!!!/<h1>";
	}

	@GetMapping("/admin")
	public String HelloAdmin() {
		return "<h1> Admin...!!</h1>";

	}

	@GetMapping("user")
	public String helloUser() {
		return "<h1>Hello..!!</h1>";
	}

}
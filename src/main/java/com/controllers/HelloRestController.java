package com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Greeting;

@RestController
public class HelloRestController {
	@GetMapping("/rest")
	public Greeting greet(@RequestParam(required=false, defaultValue="world") String name) {
		return new Greeting(String.format("Hello, %s!", name));
	}
}

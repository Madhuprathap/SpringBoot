package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	
	@RequestMapping("/hello")
	public String sayHello(@RequestParam(value = "name", required = false, defaultValue = "madhu") String name,
			Model model) {
		model.addAttribute("user", name);
		System.out.println("User entered name:->" + name);
		return "hello";
	}
}

package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/home")
	public String hello() {
		return "Hello Jenkins after change not yet from Eclipse on AWS";
	}
}

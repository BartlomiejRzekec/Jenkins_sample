package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/home")
	public String hello() {
		return "Hello Jenkins project 3 after change from Eclipse to Git to AWS";
	}
}

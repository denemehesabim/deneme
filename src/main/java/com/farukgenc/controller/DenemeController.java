package com.farukgenc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DenemeController {

	@GetMapping
	public String sayHello() {
		return "Hi";
	}
}

package com.micro.serviceone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneController {

	@GetMapping("/one/message")
	public String serviceOne() {
		return "The first service message!";
	}
}

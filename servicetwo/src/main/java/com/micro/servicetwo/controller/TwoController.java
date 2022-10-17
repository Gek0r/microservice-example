package com.micro.servicetwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoController {

	@GetMapping("/two/message")
	public String twoMessage() {
		return "This is the second message!";
	}
}

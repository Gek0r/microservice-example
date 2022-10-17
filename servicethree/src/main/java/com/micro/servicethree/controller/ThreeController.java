package com.micro.servicethree.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThreeController {

	@GetMapping("/three/message")
	public String threeMessage() {
		return "This is the third message!";
	}
}

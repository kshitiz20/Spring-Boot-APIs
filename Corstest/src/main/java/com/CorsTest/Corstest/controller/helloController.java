package com.CorsTest.Corstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CorsTest.Corstest.hello.helloresouce;

@RestController
public class helloController {
	
	@GetMapping("/hello")
	public helloresouce getHello() {
		
		return new helloresouce(1,"Hello");
	}

}

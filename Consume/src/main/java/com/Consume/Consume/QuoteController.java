package com.Consume.Consume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {
	@Autowired
	CallRest c= new CallRest();

	@GetMapping("/getQuote")
	public String getQuote() {
		return  c.callRestService();
		
	}
}
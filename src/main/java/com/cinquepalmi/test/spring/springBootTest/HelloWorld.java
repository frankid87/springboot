package com.cinquepalmi.test.spring.springBootTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping(path="/helloworld")
	public String getHelloWorld() {
		return "Hello world";		
	}

}

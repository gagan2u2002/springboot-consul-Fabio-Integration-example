package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/myworld")
	public String myworld(){
		return "welcome in my world";
	}
	
	@RequestMapping("/world")
	public String world(){
		return "welcome in Spring Boot World";
	}
//	@RequestMapping("/health")
//	public String serviceHealthChecker(){
//		return "ok";
//	}

	
}

package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/myworld")
	public String myworld(){
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@   MyController.myworld()   @@@@@@@@@@@@@@@@@@@@@@");
		return "welcome in my world";
	}
	
	@RequestMapping("/world")
	public String world(){
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@   MyController.world()   @@@@@@@@@@@@@@@@@@@@@@");
		return "welcome in Spring Boot World";
	}
//	@RequestMapping("/health")
//	public String serviceHealthChecker(){
//		return "ok";
//	}

	
}

package com.riki;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

	@RequestMapping("/")
	public String demo() {
		return "Second service";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello from second service";
	}
}

package com.trilogy.wonder;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String index() {
		return "<h1>Wonder is wonderful</h1>";
	}
	
	@RequestMapping("/param{num}")
	public String param(@PathVariable int num) {
		return "<h1>Parameter is " + num + "</h1>";
	}
}

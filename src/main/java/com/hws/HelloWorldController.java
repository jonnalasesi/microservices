package com.hws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foot")
public class HelloWorldController {

	@GetMapping("/hello")
	String Hello() {
		return "Welcome to my first class";
	}

	@GetMapping("/hello-bean")
	HelloBean HelloBean() {
		return new HelloBean("Hello World");
	}

//	@GetMapping(path = "/hello-bean/{name}")
	@GetMapping("/hello-bean/{name}")
	HelloBean HelloBeanPathVariable(@PathVariable String name) {
		return new HelloBean("Hello World: " + name);
	}
}

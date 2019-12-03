package com.hws.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hws.HelloBean;

@RestController
@RequestMapping("/foot")
public class UserController {

	@Autowired
	private UserDaoService service;

	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return service.findAll();
	}

	@GetMapping("/user/{id}")
	public User findUser(@PathVariable int id) {
		return service.findOne(id);
	}

	// @GetMapping(path = "/hello-bean/{name}")
	@PostMapping("/hello-bean/{name}")
	HelloBean HelloBeanPathVariable(@PathVariable String name) {
		return new HelloBean("Hello World: " + name);
	}
}

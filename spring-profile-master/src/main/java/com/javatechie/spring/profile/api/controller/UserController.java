package com.javatechie.spring.profile.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.profile.api.model.User;
import com.javatechie.spring.profile.api.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/findAllUsers")
	public List<User> findAllUsers() {
		return service.getUsers();
	}

}

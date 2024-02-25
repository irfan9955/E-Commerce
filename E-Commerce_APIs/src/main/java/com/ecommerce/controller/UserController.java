package com.ecommerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.User;

@RestController
public class UserController {

	@PostMapping("/api/register")
	public ResponseEntity<User> registerUser(@RequestBody User user){
		
		return null;
	}
	
//	@PostMapping("/api/login")
//	public ResponseEntity<User> loginUser(@RequestBody ){
//		
//	}
}

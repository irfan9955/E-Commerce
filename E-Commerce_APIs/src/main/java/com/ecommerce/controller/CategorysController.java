package com.ecommerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.Categorys;

@RestController
public class CategorysController {
	
	@GetMapping("/api/categories")
	public ResponseEntity<Categorys> getAllCategoryController(){
		
		return null;
	}
}

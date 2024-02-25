package com.ecommerce.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.Product;

@RestController
public class ProductsController {
	
	@GetMapping("/api/products/{categoryId}")
	public ResponseEntity<List<Product>> getProductById(@PathVariable Integer categoryId){
		
		return null;
	}

}

package com.ecommerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.CartItem;
import com.ecommerce.entity.Product;

@RestController
public class CartController {
	
	@PostMapping("/api/cart/add/{cartId}")
	public ResponseEntity<CartItem> addProdctToCart(@RequestBody Product product){
		return null;
	}
	
	@GetMapping("/api/cart")
	public ResponseEntity<CartItem> getCart(){
		return null;
	}
	
	@PutMapping("/api/cart/update")
	public ResponseEntity<CartItem> updateCartItemQuantity(@RequestBody CartItem cartItem){
		return null;
	}
	
	@DeleteMapping("/api/cart/remove/{productId}")
	public ResponseEntity<CartItem> removeProductFromCart(@PathVariable Integer productId){
		return null;
	}
	
	

}

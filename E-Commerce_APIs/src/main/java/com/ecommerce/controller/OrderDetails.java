package com.ecommerce.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.criteria.Order;

@RestController
public class OrderDetails {
	
	@PostMapping("/api/orders/place")
    public ResponseEntity<Order> placeOrder() {
        Order order = null; // orderService.placeOrder();
        return new ResponseEntity<>(order, HttpStatus.CREATED);
    }

    @GetMapping("/api/orders/history")
    public ResponseEntity<List<Order>> getOrderHistory() {
        List<Order> orders = null;//orderService.getOrderHistory();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping("/api/orders/{orderId}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long orderId) {
        Order order = null;//orderService.getOrderById(orderId);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

}

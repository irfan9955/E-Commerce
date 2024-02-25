package com.ecommerce.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	

	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<MyErrorDetail> userExceptionHandler(UserException ue,WebRequest wr){
		
		MyErrorDetail err = new MyErrorDetail();
		
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ue.getMessage());
		err.setDetails(wr.getDescription(false));
		
		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(ProductException.class)
	public ResponseEntity<MyErrorDetail> productExceptionHandler(ProductException pe,WebRequest wr){
		MyErrorDetail err = new MyErrorDetail();
		
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(pe.getMessage());
		err.setDetails(wr.getDescription(false));
		
		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(categorysException.class)
	public ResponseEntity<MyErrorDetail> categorysExceptionHandler(categorysException ce,WebRequest wr){
		
		MyErrorDetail err = new MyErrorDetail();
		
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ce.getMessage());
		err.setDetails(wr.getDescription(false));
		
		
		
		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(CartItemException.class)
	public ResponseEntity<MyErrorDetail> CartItemExceptionHandler(CartItemException ce,WebRequest wr){
		
		MyErrorDetail err = new MyErrorDetail();
		
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ce.getMessage());
		err.setDetails(wr.getDescription(false));
		
		
		
		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(OrderItemException.class)
	public ResponseEntity<MyErrorDetail> OrderItemExceptionHandler(OrderItemException ce,WebRequest wr){
		
		MyErrorDetail err = new MyErrorDetail();
		
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ce.getMessage());
		err.setDetails(wr.getDescription(false));
		
		
		
		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(OrderDetailException.class)
	public ResponseEntity<MyErrorDetail> OrderDetailExceptionHandler(OrderDetailException ce,WebRequest wr){
		
		MyErrorDetail err = new MyErrorDetail();
		
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ce.getMessage());
		err.setDetails(wr.getDescription(false));
		
		
		
		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
	}
	
	
	
}

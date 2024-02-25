package com.ecommerce.exception;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyErrorDetail {
	
	private LocalDateTime timestamp;
	private String message;
	private String details;
	
	
//	public MyErrorDetail(LocalDateTime timestamp, String message, String details) {
//		super();
//		this.timestamp = timestamp;
//		this.message = message;
//		this.details = details;
//	}

}

package com.ecommerce.entity;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class OrderDetail {

	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int OrdeId;
	    
	    @ManyToOne(cascade = CascadeType.ALL)
	    private User user;
	    
	    private LocalDateTime dateTime;
	    
	    private double price;
	    
	    
}

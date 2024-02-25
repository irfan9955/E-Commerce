package com.ecommerce.entity;

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
public class OrderItem {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int crderItemId;
	    
	    @ManyToOne(cascade =  CascadeType.ALL)
	    private OrderDetail order;
	    
	    @ManyToOne(cascade = CascadeType.ALL)
	    private Product product;
	    
	    private int quantity;

}

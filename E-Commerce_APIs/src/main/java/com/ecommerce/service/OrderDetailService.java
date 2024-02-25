package com.ecommerce.service;

import com.ecommerce.entity.OrderDetail;
import com.ecommerce.exception.OrderDetailException;

public interface OrderDetailService {
	
	public OrderDetail placeOrder() throws OrderDetailException;
	
	public OrderDetail getUserOrder() throws OrderDetailException;
	
	public OrderDetail getOrderBYId(Integer orderId) throws OrderDetailException;

}

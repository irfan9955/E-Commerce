package com.ecommerce.service;

import com.ecommerce.entity.Product;
import com.ecommerce.exception.ProductException;

public interface ProductService {
	
	public Product addProduct(Product product) throws ProductException;
	
	public Product getProductByCategorys(Integer CategoryId) throws ProductException;
	
	public Product getProductById(Integer productId) throws ProductException;

}

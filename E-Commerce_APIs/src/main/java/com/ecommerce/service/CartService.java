package com.ecommerce.service;


import com.ecommerce.entity.CartItem;
import com.ecommerce.entity.Product;
import com.ecommerce.exception.CartItemException;

public interface CartService {
	
	public CartItem addProductToCart() throws CartItemException;
	
	public CartItem viewCart() throws CartItemException;
	
	public CartItem updateCartItem() throws CartItemException;
	
	public CartItem removeProductFromCart(Product product) throws CartItemException;
}

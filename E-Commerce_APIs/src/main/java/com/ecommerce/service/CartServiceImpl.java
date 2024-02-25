package com.ecommerce.service;

import org.springframework.stereotype.Service;

import com.ecommerce.entity.CartItem;
import com.ecommerce.entity.Product;
import com.ecommerce.exception.CartItemException;

@Service
public class CartServiceImpl implements CartService{

	@Override
	public CartItem addProductToCart() throws CartItemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartItem viewCart() throws CartItemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartItem updateCartItem() throws CartItemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartItem removeProductFromCart(Product product) throws CartItemException {
		// TODO Auto-generated method stub
		return null;
	}

}

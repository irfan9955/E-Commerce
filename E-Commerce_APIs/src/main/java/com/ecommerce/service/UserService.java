package com.ecommerce.service;

import com.ecommerce.entity.User;
import com.ecommerce.exception.UserException;

public interface UserService {
	
	public User registerUser(User user) throws UserException;
	
	public User loginUser(String userName,String Password) throws UserException;

}

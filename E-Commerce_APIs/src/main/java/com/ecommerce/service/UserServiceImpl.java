package com.ecommerce.service;

import org.springframework.stereotype.Service;

import com.ecommerce.entity.User;
import com.ecommerce.exception.UserException;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public User registerUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User loginUser(String userName, String Password) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

}

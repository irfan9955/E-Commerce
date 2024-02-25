package com.ecommerce.service;

import java.util.List;

import com.ecommerce.entity.Categorys;
import com.ecommerce.exception.categorysException;

public interface CategorysService {
	
	public List<Categorys> getAllCategorys() throws categorysException;

}

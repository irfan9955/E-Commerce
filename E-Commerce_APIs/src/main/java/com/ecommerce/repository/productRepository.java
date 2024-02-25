package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.entity.Product;

public interface productRepository extends JpaRepository<Product, Integer>{

}

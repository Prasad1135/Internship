package com.example.service;

import java.util.List;

import com.example.entity.Product;

public interface ProductService {
	Product createProduct(Product product);
	List<Product> findAllProduct();
}

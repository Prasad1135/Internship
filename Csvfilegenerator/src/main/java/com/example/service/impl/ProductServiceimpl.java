package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;
import com.example.service.ProductService;
@Service
public class ProductServiceimpl implements ProductService{
@Autowired
ProductRepository productRepository;
	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public List<Product> findAllProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

}

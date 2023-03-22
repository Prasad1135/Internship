package com.example.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.csvgenerator.CsvFileGenerator;
import com.example.entity.Product;
import com.example.repository.ProductRepository;
import com.example.service.ProductService;
@RestController
public class ProductController {
@Autowired
ProductRepository productRepository;
@Autowired
private CsvFileGenerator csvfileGenerator;

@PostMapping("/product")
void addUser(@RequestBody Product product) {
	productRepository.save(product);
}

// Get Doctor Method
@GetMapping(value = "/product")
public List<Product> findAllproduct()
{
	return productRepository.findAll();
	}

@GetMapping("/exporttocsv")
public void exportIntoCSV(HttpServletResponse response) throws IOException {
  response.setContentType("text/csv");
  response.addHeader("Content-Disposition", "attachment; filename=\"product.csv\"");
  csvfileGenerator.writeProductToCsv(productRepository.findAll() ,response.getWriter());
}
}

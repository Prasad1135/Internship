package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Product;

@RestController
public class Services {
	@GetMapping("/Product")
	public Product test() {
		Product product=new Product();
		product.setName("Iphone");
		product.setPrice(50000);
		product.setAbout("this is new launched Iphone");
 return product;
	}
}

package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.entity.Example;
import com.example.service.ExampleService;
@RestController
public class ExampleController {
	@Autowired
	ExampleService exampleService;
	
	
	@PostMapping("/example")
	public Example createExample(@RequestBody Example example) {
		return exampleService.createExample(example);
	}
	
	@GetMapping("/example")
	public List<Example> findAllExample(){
		return exampleService.findAllExample();
	}
}

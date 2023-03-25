package com.example.service;
import java.util.List;


import com.example.entity.Example;

public interface ExampleService {
	Example createExample(Example example);

	List<Example> findAllExample();
}

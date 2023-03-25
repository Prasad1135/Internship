package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.example.service.ExampleService;
import com.example.entity.Example;
import com.example.repository.ExampleRepo;
@Service

public class ExampleServiceImpl implements ExampleService {
@Autowired
ExampleRepo exampleRepo;
	@Override
	public Example createExample(Example example) {
		// TODO Auto-generated method stub
		return exampleRepo.save(example);
	}

	@Override
	public List<Example> findAllExample() {
		// TODO Auto-generated method stub
		return exampleRepo.findAll();
	}

}

package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.Example;

public interface ExampleRepo extends JpaRepository<Example, Integer> {

}

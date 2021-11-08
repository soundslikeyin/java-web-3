package com.yin.javaexercise3.repository;

import org.springframework.data.repository.CrudRepository;
import com.yin.javaexercise3.data.entity.Sales;

public interface SalesRepository extends CrudRepository<Sales, Integer> {
}

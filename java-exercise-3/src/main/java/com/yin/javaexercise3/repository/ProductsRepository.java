package com.yin.javaexercise3.repository;

import org.springframework.data.repository.CrudRepository;
import com.yin.javaexercise3.data.entity.Product;

public interface ProductsRepository extends CrudRepository<Product, Integer>
{
}

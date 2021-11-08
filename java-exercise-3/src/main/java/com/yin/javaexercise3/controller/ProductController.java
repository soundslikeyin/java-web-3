package com.yin.javaexercise3.controller;

import com.yin.javaexercise3.data.entity.Product;
import com.yin.javaexercise3.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@CrossOrigin( "*" )
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private final ProductsRepository productsRepository;

    public ProductController(final ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @GetMapping
    public Iterable<Product> getAllProducts() {
        return this.productsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable("id") String id) {
        return this.productsRepository.findById(Integer.parseInt(id));
    }

    @PostMapping()
    public Product createNewSale(@RequestBody Product sale) {
        Product newProduct = this.productsRepository.save(sale);
        return newProduct;
    }

}
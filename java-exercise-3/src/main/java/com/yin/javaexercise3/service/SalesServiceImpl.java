package com.yin.javaexercise3.service;

import com.yin.javaexercise3.data.entity.Sales;
import com.yin.javaexercise3.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class SalesServiceImpl implements SalesService{

//    @Autowired
    private final SalesRepository salesRepository;

    public SalesServiceImpl(SalesRepository salesRepository) {
        this.salesRepository = salesRepository;
    }

    @Override
    public Sales getSale(int id) {
        Optional<Sales> sale = this.salesRepository.findById(id);

        if (!sale.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The ID does not exist.");
        }

        return sale.get();
//        return sale.orElse(null);
    }

}
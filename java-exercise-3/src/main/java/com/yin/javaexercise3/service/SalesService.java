package com.yin.javaexercise3.service;

import com.yin.javaexercise3.data.entity.Sales;

public interface SalesService {
    Sales getSale(int id);
    Sales addSale(Sales sale);
    Iterable<Sales> getAll();
}
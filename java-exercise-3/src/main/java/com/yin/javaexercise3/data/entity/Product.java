package com.yin.javaexercise3.data.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name="Product")
@Table(name="Products")
public class Product {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String description;

    private Integer price;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    @OneToMany(targetEntity=Sales.class, mappedBy="product", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Sales> sales;

    public Integer getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public Integer getPrice(){
        return this.price;
    }

}

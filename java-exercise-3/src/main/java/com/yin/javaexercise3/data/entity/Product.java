package com.yin.javaexercise3.data.entity;

import javax.persistence.*;

@Entity
@Table(name="Products")
public class Product {
    @Id
    @GeneratedValue
    // type integer vs long?
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="price")
    private Integer price;

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

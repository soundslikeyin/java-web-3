package com.yin.javaexercise3.data.entity;

import javax.persistence.*;

@Entity
@Table(name="Sales")
public class Sales {
    @Id
    @GeneratedValue
    // type integer vs long?
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId")
    private Product product;

    @Column(name="description")
    private String description;

    @Column(name="total")
    private Integer total;


    public Integer getId(){
        return this.id;
    }

    public Product getProduct(){
        return this.product;
    }

    public String getDescription(){
        return this.description;
    }

    public Integer getTotal(){
        return this.total;
    }

}

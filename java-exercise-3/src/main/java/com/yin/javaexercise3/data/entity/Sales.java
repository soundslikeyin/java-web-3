package com.yin.javaexercise3.data.entity;

import javax.persistence.*;

@Entity(name="Sales")
@Table(name="Sales")
public class Sales {
    @Id
    @GeneratedValue
    private Integer id;

//    @ManyToOne(fetch = FetchType.LAZY)
    @ManyToOne()
    @JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Product product;

    private String description;

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

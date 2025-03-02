package com.project.shoppingCart.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@Entity
@Table
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;

    @Lob
    private byte[] image;
    private String name;
    private Integer price;


    public ProductEntity(byte[] image, String name, Integer price) {
        this.image = image;
        this.name = name;
        this.price = price;
    }

    public ProductEntity() {
        super();
    }

}

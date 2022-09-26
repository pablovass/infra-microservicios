package com.pablovass.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremental
    private  Long id;
    private  String name;
    private String description;
    private  Double stock;
    private  Double price;
    private  String status;

    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
}

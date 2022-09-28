package com.natural.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document
public class Product {
    private  String productName;
    private  int productPrice;
    private int productQuantity;

}

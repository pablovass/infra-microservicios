package com.natural.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "smartDB")
@Data
@AllArgsConstructor
public class Product {
    private  String name;
    private  int quantity;
    private  int price;

}

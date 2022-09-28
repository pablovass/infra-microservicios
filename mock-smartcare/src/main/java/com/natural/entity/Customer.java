package com.natural.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document(collection = "db")


public class Customer {
    private int custId;
    private String cusName;
    private List<Product> products;
    private Address address;
}

package com.natural.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "smartDB")
@Data
@AllArgsConstructor

public class User {
    @Id
    private int id;
    private  String name;
    private  String gener;
private List<Product>products;
private  Address address;
}

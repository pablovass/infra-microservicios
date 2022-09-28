package com.natural.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "smartDB")
@Data
@AllArgsConstructor

public class Address {
    private  String city;
    private  String state;
    private String pincode;

}

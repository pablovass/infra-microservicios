package com.natural.repository;

import com.natural.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICostumerRepository extends MongoRepository<Customer,Integer> {

}

package com.natural.service;

import com.natural.entity.Customer;
import com.natural.repository.ICostumerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements ICustomerService{
    @Autowired
    ICostumerRepository repository;
    @Override
    public List<Customer> getAllCustomer() {
        return repository.findAll();
    }

    @Override
    public Optional<Customer> getCustomerById(int custId) {
        return repository.findById(custId);
    }

    @Override
    public void addCustomer(Customer cust) {
        System.out.println();
        repository.save(cust);
    }

    @Override
    public void updateCustomer(Customer cust, int custId) {

    }

    @Override
    public void deleteCutomer(int custId) {

    }
}

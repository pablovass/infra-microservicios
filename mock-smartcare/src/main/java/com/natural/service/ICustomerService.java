package com.natural.service;

import com.natural.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    List<Customer> getAllCustomer();

    Optional<Customer> getCustomerById(int custId);

    void addCustomer(Customer cust);

    void updateCustomer(Customer cust, int custId);

    void deleteCutomer(int custId);
}

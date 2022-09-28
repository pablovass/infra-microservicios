package com.natural.controller;

import com.natural.entity.Customer;
import com.natural.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;

    @RequestMapping("/customers")
    public List<Customer>getAllCustomer(){
        return iCustomerService.getAllCustomer();
    }
    @RequestMapping("/customers/{cusId}")
    public Optional<Customer>getCustomerById(@PathVariable int custId){
        return iCustomerService.getCustomerById(custId);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/customers")
    public void  addCustomer(@RequestBody Customer cust){
        iCustomerService.addCustomer(cust);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/cutomers/custId")
    public void updateCustomer(@RequestBody Customer cust,@PathVariable int custId){
        iCustomerService.updateCustomer(cust,custId);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/customers/{custId}")
    public void deleteCustomer(@PathVariable int custId){
        iCustomerService.deleteCutomer(custId);
    }

}

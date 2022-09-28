package com.natural.controller;

import com.natural.pojo.User;
import com.natural.repository.SmartCareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order-service")
public class SmartCareController {
    @Autowired
    private SmartCareRepository smartCareRepository;

    @PostMapping("/orden")
    public String placeOrder(@RequestBody User user) {
        smartCareRepository.save(user);
        return "la orden fue hecha";
    }

    @GetMapping("/{name}")
    public List<User> getUserByName(String name) {
        return smartCareRepository.findByName(name);
    }

    @GetMapping("/address/{city}")
    public List<User> getUserByAddress(String city) {
        return smartCareRepository.findByCity(city);
    }
}

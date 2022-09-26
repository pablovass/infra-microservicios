package com.pablovass.repository;

import com.pablovass.entity.Category;
import com.pablovass.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    public List<Product>findCategory(Category category);
    
}

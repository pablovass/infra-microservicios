package com.pablovass.app.domain.repository;

import com.pablovass.app.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ProductRepository {
    List<Product>getAll();
    Optional<List<Product>>getByCategory(int categoryId);
    Optional<List<Product>>getScarseProducts(int quatity);
    Optional<Product>getProduct(int productId);
    Product save(Product product);
    void delete(int productId);
}

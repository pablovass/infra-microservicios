package com.pablovass.app.persitence;

import com.pablovass.app.persitence.crud.ProductoCrudRepository;
import com.pablovass.app.persitence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;
    public List<Producto>getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}

package com.pablovass.app.persitence.crud;

import com.pablovass.app.persitence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {
}

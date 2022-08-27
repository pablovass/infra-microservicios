package com.pablovass.app.persitence.crud;

import com.pablovass.app.persitence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>{
   // @Query(value = "SELECT* FROM productos  WHERE id_categoria=? ",nativeQuery = true)
    //si tenemos la query podemos llama al metodo como nosotros queramos
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);//esto es una query method
        Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
    }



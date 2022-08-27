package com.pablovass.app.persitence.crud;

import com.pablovass.app.persitence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {
   // @Query(value = "SELECT* FROM productos  WHERE id_categoria=? ",nativeQuery = true)
    //si tenemos la query podemos llama al metodo como nosotros queramos
    List<Producto> findByCategoriaOrderByNombreAsc(int idCartegoria); // esto es un query method
    Optional<List<Producto>>findByCantidadStockLessThanAndEstado(int cantidadStock,boolean estado);


}

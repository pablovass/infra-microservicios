package com.pablovass.app.persitence;

import com.pablovass.app.persitence.crud.ProductoCrudRepository;
import com.pablovass.app.persitence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;
    public List<Producto>getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
    public List<Producto>getByCategoria(int idCategoria){
        return  productoCrudRepository.findByCategoriaOrderByNombreAsc(idCategoria);
    }
    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
    }
    public Optional<Producto>getProducto(int idProducto){
        return  productoCrudRepository.findById(idProducto);
    }
    public void delete(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }
    public  Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }

}

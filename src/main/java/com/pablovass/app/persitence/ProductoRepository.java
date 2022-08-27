package com.pablovass.app.persitence;

import com.pablovass.app.domain.Product;
import com.pablovass.app.domain.repository.ProductRepository;
import com.pablovass.app.persitence.crud.ProductoCrudRepository;
import com.pablovass.app.persitence.entity.Producto;
import com.pablovass.app.persitence.mapper.ProductMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class ProductoRepository implements ProductRepository {
    private ProductoCrudRepository productoCrudRepository;
    private ProductMapper mapper;
    @Override
    public List<Product>getAll()
    {
        List<Producto>productos=(List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public Optional<List<Product>> getByCategory(int categoryId) {
        List<Producto>productos=productoCrudRepository.findByCategoriaOrderByNombreAsc(categoryId);
        return Optional.of(mapper.toProducts(productos));
    }

    @Override
    public Optional<List<Product>> getScarseProducts(int quatity) {
        Optional<List<Producto>>productos= productoCrudRepository.findByCantidadStockLessThanAndEstado(quatity,true);
        return productos.map(prods->mapper.toProducts(prods));
    }

    @Override
    public Optional<Product> getProduct(int productId) {
        return productoCrudRepository.findById(productId).map(producto -> mapper.toProduct(producto));
    }

    @Override
    public Product save(Product product) {
        Producto producto= mapper.toProducto(product);
        return mapper.toProduct(productoCrudRepository.save(producto));
    }
@Override
    public void delete(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }

}

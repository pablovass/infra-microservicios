package com.pablovass.app.persitence.mapper;

import com.pablovass.app.domain.Product;
import com.pablovass.app.persitence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring",uses = {CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping( source = "idProducto",target="productId"),
            @Mapping(source="nombre",target="name"),
            @Mapping(source="idCategoria",target="CategoryId"),
            @Mapping(source="precioVenta",target="price"),
            @Mapping(source="cantidadStock",target="stock"),
            @Mapping(source="estado",target="active"),
            @Mapping(source="categoria",target="category")
    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto>productos);

    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras",ignore = true)
    Producto toProducto(Product product);
}

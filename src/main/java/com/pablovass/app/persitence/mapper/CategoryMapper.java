package com.pablovass.app.persitence.mapper;

import com.pablovass.app.domain.Category;
import com.pablovass.app.persitence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria",target="categoryId"),
            @Mapping(source = "descripcion",target="category"),
            @Mapping(source = "estado",target="active")
    })
    Category toCategoryMapper(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos",ignore = true)
    Categoria toCategoria(Category category);
}

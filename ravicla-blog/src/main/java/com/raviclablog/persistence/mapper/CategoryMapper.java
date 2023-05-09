package com.raviclablog.persistence.mapper;

import com.raviclablog.domain.Category;
import com.raviclablog.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "categoria", target = "category"),
    })
    Category toCategory(Categoria categoria);
    List<Category>toCategories(List<Categoria>categorias);
    @InheritInverseConfiguration
    Categoria toCategoria(Category category);
}

package com.raviclablog.persistence;

import com.raviclablog.domain.Category;
import com.raviclablog.domain.repository.CategoryRepository;
import com.raviclablog.persistence.crud.CategoriaCrudRepository;
import com.raviclablog.persistence.entity.Categoria;
import com.raviclablog.persistence.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class CategoriaRepository implements CategoryRepository {
    @Autowired
    private CategoriaCrudRepository categoriaCrudRepository;

    @Autowired
    private CategoryMapper categoryMapper;



    @Override
    public List<Category> getAll() {
        try{
            List<Categoria>categorias = (List<Categoria>) categoriaCrudRepository.findAll();
            return categoryMapper.toCategories(categorias);
        } catch (Exception e){

        }
        return null;
    }

    @Override
    public Optional<Category> getCategory(int categoryId) {
        return categoriaCrudRepository.findById(categoryId).map(categoria -> categoryMapper.toCategory(categoria));
    }

    @Override
    public Category save(Category category) {
        Categoria categoria = categoryMapper.toCategoria(category);
        return categoryMapper.toCategory(categoriaCrudRepository.save(categoria));
    }

    @Override
    public void delete(int categoriaId) {
        categoriaCrudRepository.deleteById(categoriaId);
    }
}

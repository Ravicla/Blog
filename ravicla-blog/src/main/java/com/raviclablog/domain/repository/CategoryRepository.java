package com.raviclablog.domain.repository;

import com.raviclablog.domain.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository {
    List<Category>getAll();
    Optional<Category>getCategory(int categoryId);
    Category save (Category category);
    void delete(int categoryId);
}

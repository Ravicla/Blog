package com.raviclablog.persistence.crud;

import com.raviclablog.persistence.entity.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostCrudRepository extends CrudRepository<Post, Integer> {
    List<Post>findByIdUsuario(int idUsuario);
}

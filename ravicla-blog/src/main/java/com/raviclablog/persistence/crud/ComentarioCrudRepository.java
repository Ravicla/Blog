package com.raviclablog.persistence.crud;

import com.raviclablog.persistence.entity.Comentario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ComentarioCrudRepository extends CrudRepository<Comentario, Integer> {
    List<Comentario>findByIdPost(int idPost);
}

package com.raviclablog.persistence;

import com.raviclablog.domain.Comment;
import com.raviclablog.domain.repository.CommentRepository;
import com.raviclablog.persistence.crud.ComentarioCrudRepository;
import com.raviclablog.persistence.entity.Comentario;
import com.raviclablog.persistence.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class ComentarioRepository implements CommentRepository {
    @Autowired
    private ComentarioCrudRepository comentarioCrudRepository;
    @Autowired
    private CommentMapper commentMapper;


    @Override
    public List<Comment> getAll() {
        try{
            List<Comentario>comentarios = (List<Comentario>) comentarioCrudRepository.findAll();
            return commentMapper.toComments(comentarios);
        }catch (Exception e){

        }
        return null;
    }

    @Override
    public Optional<Comment> getComment(int commentId) {
        return comentarioCrudRepository.findById(commentId).map(comentario -> commentMapper.toComment(comentario));
    }

    @Override
    public Comment save(Comment comment) {
        Comentario comentario = commentMapper.toComentario(comment);
        return commentMapper.toComment(comentarioCrudRepository.save(comentario));
    }

    @Override
    public void delete(int comentarioId) {
        comentarioCrudRepository.deleteById(comentarioId);
    }
}

package com.raviclablog.domain.repository;

import com.raviclablog.domain.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentRepository {
    List<Comment>getAll();
    Optional<Comment>getComment(int commentId);
    Comment save(Comment comment);
    void delete(int commentId);

}

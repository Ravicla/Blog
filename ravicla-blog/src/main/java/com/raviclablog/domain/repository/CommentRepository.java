package com.raviclablog.domain.repository;

import com.raviclablog.domain.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentRepository {
    List<Comment>getAll();
    Optional<Comment>getComment(int commentId);

    Optional<Comment>getCommentDetailsUser(int userId);
    List<Comment>getCommentUser(int userId);

    Optional<Comment>getCommentDetailsBlogPost(int blogPostId);
    List<Comment>getCommentBlogPost(int blogPostId);

    Comment save(Comment comment);
    void delete(int commentId);

}

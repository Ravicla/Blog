package com.raviclablog.domain.repository;

import com.raviclablog.domain.BlogPost;

import java.util.List;
import java.util.Optional;

public interface BlogPostRepository {
    List<BlogPost>getAll();
    Optional<BlogPost>getBlogPost(int blogPostId);

    Optional<BlogPost>getBlogPostDetailsUser(int userId);
    List<BlogPost>getBlogPostUser(int userId);

    Optional<BlogPost>getBlogPostDetailsCategory(int categoryId);
    List<BlogPost>getBlogPostCategory(int categoryId);

    BlogPost save (BlogPost blogPost);
    void delete(int blogPostId);
}

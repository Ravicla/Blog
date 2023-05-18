package com.raviclablog.domain.repository;

import com.raviclablog.domain.BlogPost;

import java.util.List;
import java.util.Optional;

public interface BlogPostRepository {
    List<BlogPost>getAll();
    Optional<BlogPost> getBlogPost(int blogPostId);
    Optional<BlogPost> getBlogPostDetails(int blogPostId);
    List<BlogPost> getBlogPostUser(int blogPostId);


    BlogPost save (BlogPost blogPost);
    void delete(int blogPostId);
}

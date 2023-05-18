package com.raviclablog.persistence;

import com.raviclablog.domain.BlogPost;
import com.raviclablog.domain.Category;
import com.raviclablog.domain.repository.BlogPostRepository;
import com.raviclablog.persistence.crud.CategoriaCrudRepository;
import com.raviclablog.persistence.crud.PostCrudRepository;
import com.raviclablog.persistence.entity.Categoria;
import com.raviclablog.persistence.entity.Post;
import com.raviclablog.persistence.mapper.BlogPostMapper;
import com.raviclablog.persistence.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PostRepository implements BlogPostRepository {
    @Autowired
    private PostCrudRepository postCrudRepository;
    @Autowired
    private CategoriaCrudRepository categoriaCrudRepository;
    @Autowired
    private BlogPostMapper blogPostMapper;
    @Autowired
    private CategoryMapper categoryMapper;


    @Override
    public List<BlogPost> getAll() {
        List<Post>posts= (List<Post>) postCrudRepository.findAll();
        return blogPostMapper.toBlogPosts(posts);
    }

    @Override
    public Optional<BlogPost> getBlogPost(int blogPostId) {
        return postCrudRepository.findById(blogPostId).map(post -> blogPostMapper.toBlogPost(post));
    }

    @Override
    public Optional<BlogPost> getBlogPostDetails(int blogPostId) {
        /*try{
            Optional<BlogPost>blogPost = postCrudRepository.findById(blogPostId).map(post -> blogPostMapper.toBlogPost(post));
            Optional<Categoria>categoria = categoriaCrudRepository.findById(blogPost.get().getCategoryId());
            Category category = categoryMapper.toCategory(categoria.get());
            blogPost.get().setCategory(category);
            return blogPost;
        }catch (Exception e) {

        } */
        return null;
    }

    @Override
    public List<BlogPost> getBlogPostUser(int blogPostId) {
        return null;
    }


    @Override
    public BlogPost save(BlogPost blogPost) {
        Post post = blogPostMapper.toPost(blogPost);
        return blogPostMapper.toBlogPost(postCrudRepository.save(post));
    }

    @Override
    public void delete(int postId) {
    postCrudRepository.deleteById(postId);
    }
}

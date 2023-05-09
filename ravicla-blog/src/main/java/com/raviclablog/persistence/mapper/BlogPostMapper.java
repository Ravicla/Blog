package com.raviclablog.persistence.mapper;

import com.raviclablog.domain.BlogPost;
import com.raviclablog.persistence.entity.Post;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BlogPostMapper {
    @Mappings({
            @Mapping(source = "idPost", target = "blogPostId"),
            @Mapping(source = "titulo", target = "title"),
            @Mapping(source = "descripcion", target = "post"),
            @Mapping(source = "fechaPublicacion", target = "postDate"),
            @Mapping(source = "foto", target = "image"),
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "idCategoria", target = "categoryId"),
    })
    BlogPost toBlogPost(Post post);
    List<BlogPost>toBlogPosts(List<Post>posts);
    @InheritInverseConfiguration
    Post toPost(BlogPost blogPost);
}

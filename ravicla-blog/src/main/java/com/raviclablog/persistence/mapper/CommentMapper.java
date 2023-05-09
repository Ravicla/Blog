package com.raviclablog.persistence.mapper;

import com.raviclablog.domain.Comment;
import com.raviclablog.persistence.entity.Comentario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    @Mappings({
            @Mapping(source = "idComentario", target = "commentId"),
            @Mapping(source = "comentario", target = "comment"),
            @Mapping(source = "fechaComentario", target = "commentDate"),
            @Mapping(source = "idPost", target = "blogPostId"),
            @Mapping(source = "idUsuario", target = "userId"),
    })
    Comment toComment(Comentario comentario);
    List<Comment>toComments(List<Comentario>comentarios);
    @InheritInverseConfiguration
    Comentario toComentario(Comment comment);
}

package com.raviclablog.persistence.mapper;

import com.raviclablog.domain.User;
import com.raviclablog.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mappings({
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellido", target = "lastName"),
            @Mapping(source = "apodo", target = "nickname"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "foto", target = "photo"),
            @Mapping(source = "clave", target = "password"),
    })
    User toUser(Usuario usuario);
    List<User>toUsers(List<Usuario>usuarios);
    @InheritInverseConfiguration
    Usuario toUsuario(User user);
}

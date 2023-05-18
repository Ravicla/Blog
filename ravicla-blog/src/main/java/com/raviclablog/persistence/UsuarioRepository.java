package com.raviclablog.persistence;

import com.raviclablog.domain.BlogPost;
import com.raviclablog.domain.User;
import com.raviclablog.domain.repository.BlogPostRepository;
import com.raviclablog.domain.repository.CommentRepository;
import com.raviclablog.domain.repository.UserRepository;
import com.raviclablog.persistence.crud.UsuarioCrudRepository;
import com.raviclablog.persistence.entity.Usuario;
import com.raviclablog.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UsuarioRepository implements UserRepository {
    @Autowired
    private UsuarioCrudRepository usuarioCrudRepository;
    @Autowired
    private BlogPostRepository blogPostRepository;

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getAll() {
        try{
            List<Usuario>usuarios = (List<Usuario>) usuarioCrudRepository.findAll();
            return userMapper.toUsers(usuarios);
        }catch (Exception e){

        }
        return null;
    }

    @Override
    public Optional<User> getUser(int userId) {
        return usuarioCrudRepository.findById(userId).map(usuario -> userMapper.toUser(usuario));
    }
    @Override
    public Optional<User> getUserDetailsBlogPost(int userId) {

        return Optional.empty();
    }

    @Override
    public Optional<User> getUserDetailsComment(int userId) {
        Optional<User>user = usuarioCrudRepository.findById(userId).map(usuario -> userMapper.toUser(usuario));

        return Optional.empty();
    }


    @Override
    public User save(User user) {
        Usuario usuario = userMapper.toUsuario(user);
        return userMapper.toUser(usuarioCrudRepository.save(usuario));
    }

    @Override
    public void delete(int usuarioId) {
        usuarioCrudRepository.deleteById(usuarioId);
    }


}

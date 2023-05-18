package com.raviclablog.domain.repository;

import com.raviclablog.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User>getAll();
    Optional<User>getUser(int userId);
    Optional<User>getUserDetailsBlogPost(int userId);
    Optional<User>getUserDetailsComment(int userId);
    User save(User user);
    void delete(int userId);


}

package me.dio.domain.service.impl;

import me.dio.domain.model.User;

public interface UserService<UserToCreate> {

    User findById(Long id);

    User create();

    User create(User userToCreate);
}

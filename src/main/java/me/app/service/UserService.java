package me.app.service;

import me.app.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User user);
}

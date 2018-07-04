package com.amazing.auth.service;

import com.amazing.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}

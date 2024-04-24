package com.akai.service;

import com.akai.pojo.User;

import java.util.List;

public interface UserService {
    User findUser(String name, String password);

    List<User> findAll();
}

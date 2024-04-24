package com.akai.service.impl;

import com.akai.mapper.UserMapper;
import com.akai.pojo.User;
import com.akai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUser(String name, String password) {
        return userMapper.findUser(name, password);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}

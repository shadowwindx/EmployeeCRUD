package com.wind.crud.service;

import com.wind.crud.entity.User;
import com.wind.crud.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public User queryByName(String accountName) {
        return userMapper.queryByName(accountName);
    }

    @Override
    public User authenticateUser(String accountName, String password) {
        return userMapper.authenticateUser(accountName,password);
    }
}

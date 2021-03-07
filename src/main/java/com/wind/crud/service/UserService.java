package com.wind.crud.service;

import com.wind.crud.entity.User;

import java.util.List;

public interface UserService {
    //查詢
    List<User> queryAllUser();

    //用戶註冊
    int addUser(User user);

    //根據用戶名稱查詢
    User queryByName(String accountName);

    //根據用戶名稱查詢
    User authenticateUser(String accountName ,String password);

}

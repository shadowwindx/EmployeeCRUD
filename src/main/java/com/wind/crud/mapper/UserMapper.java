package com.wind.crud.mapper;

import com.wind.crud.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    //查詢
    List<User> queryAllUser();
    //用戶註冊
    int addUser (User user);
    //根據用戶名稱查詢
    User queryByName(@Param("accountName") String accountName);
    //帳密驗證
    User authenticateUser
    (@Param("accountName") String accountName ,@Param("password")String password);
}

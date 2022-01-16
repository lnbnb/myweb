package com.lnb.mall.dao;

import com.lnb.mall.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    int insertUser(String name, String password, String email, Integer identity, String phoneNumber);
    User selectUserByName( String name);
    List<User> findAllUsers();
}

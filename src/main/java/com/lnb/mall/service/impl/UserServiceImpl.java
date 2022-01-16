package com.lnb.mall.service.impl;

import com.lnb.mall.dao.UserDao;
import com.lnb.mall.model.entity.User;
import com.lnb.mall.service.intf.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public boolean register(String name, String password, String email, Integer identity, String phoneNumber) {
        int res = userDao.insertUser(name,password,email,identity,phoneNumber);
        return res != 0;
    }

    @Override
    public User queryUserByName(String name) {
        return userDao.selectUserByName(name);
    }

    @Override
    public List<User> findAllUsers() {
        return userDao.findAllUsers();
    }
}

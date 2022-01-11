package com.lnb.mall.service.intf;

import com.lnb.mall.model.entity.User;

public interface UserService {
    boolean register(String name, String password, String email, Integer identity, String phoneNumber);
    User queryUserByName(String name);
}

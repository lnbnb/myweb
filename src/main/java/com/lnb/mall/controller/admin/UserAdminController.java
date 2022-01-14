package com.lnb.mall.controller.admin;

import com.lnb.mall.model.entity.User;
import com.lnb.mall.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserAdminController {
    @Resource
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/admin/user")
    public String userAdmin(){
        return "admin-user";
    }

    @PostMapping("/admin/user/searchbyname/{userName}")
    @ResponseBody
    public User searchUserByName(@PathVariable("userName") String userName){
        return userServiceImpl.queryUserByName(userName);
    }
}

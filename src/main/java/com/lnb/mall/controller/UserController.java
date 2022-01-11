package com.lnb.mall.controller;

import com.lnb.mall.model.entity.User;
import com.lnb.mall.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/login")
    public String logIn(){
        return "login";
    }

    @PostMapping("/login_verification")
    @ResponseBody
    public String logInVerification(String password,String username){
        User user = userServiceImpl.queryUserByName(username);

        if (user==null){
            return "Incorrect username!";
        } else if (user.getPassword().equals(password)){
            return "Successfully logged in!";
        }else {
            return "Incorrect password!";
        }
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @PostMapping("/register_verification")
    @ResponseBody
    public String registerVerification(String username, String password, String email, String phoneNumber){
        if (userServiceImpl.register(username,password,email,1,phoneNumber)){
            return "Successfully registered!";
        }else {
            return "Incorrect register";
        }

    }
}

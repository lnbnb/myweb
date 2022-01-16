package com.lnb.mall.controller;

import com.lnb.mall.model.entity.User;
import com.lnb.mall.service.impl.UserServiceImpl;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LogInController {
    @Resource
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/login")
    public String logIn() {
        return "login";
    }

    @PostMapping("/login_verification")
    public String logInVerification(String password, String username,
                                    HttpServletResponse response, HttpSession session) throws Exception{
        User user = userServiceImpl.queryUserByName(username);
        if (user == null) {
            throw new Exception("用户不存在!");
        } else if (user.getPassword().equals(password)) {
            session.setAttribute("user",user);
            Cookie cookie = new Cookie("sessionId", session.getId());
            response.addCookie(cookie);
            return "index";
        } else {
            throw new Exception("密码错误!");
        }
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register_verification")
    @ResponseBody
    public String registerVerification(String username, String password, String email, String phoneNumber) {
        if (userServiceImpl.register(username, password, email, 1, phoneNumber)) {
            return "Successfully registered!";
        } else {
            return "Incorrect register";
        }

    }
}

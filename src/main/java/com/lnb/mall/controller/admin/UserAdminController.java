package com.lnb.mall.controller.admin;

import com.lnb.mall.model.entity.User;
import com.lnb.mall.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserAdminController {
    @Resource
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/admin/user")
    public ModelAndView userAdmin(){
        List<User> users = userServiceImpl.findAllUsers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("users",users);
        modelAndView.setViewName("admin-user");
        return modelAndView;
    }

    @PostMapping("/admin/user/searchbyname/{userName}")
    @ResponseBody
    public User searchUserByName(@PathVariable("userName") String userName){
        return userServiceImpl.queryUserByName(userName);
    }
}

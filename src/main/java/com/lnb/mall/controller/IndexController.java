package com.lnb.mall.controller;

import com.lnb.mall.model.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @RequestMapping("")
    public String index(HttpSession session, Model model){
        User user = (User) session.getAttribute("user");
        model.addAttribute("user",user);
        return "index";
    }
}

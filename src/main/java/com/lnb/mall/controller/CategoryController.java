package com.lnb.mall.controller;

import com.lnb.mall.service.impl.CategoryServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class CategoryController {
    @Resource
    private CategoryServiceImpl categoryServiceImpl;

    @RequestMapping("/category")
    public String category(){
        return "categoryadd";
    }

    @PostMapping("/category_add")
    @ResponseBody
    public String addCategory(Integer categoryId,Integer userId,String name,String discription,Double price){
        if (categoryServiceImpl.addCategory(categoryId,userId,name,discription,price)){
            return "successfully added!";
        }else{
            return "failed";
        }
    }

}

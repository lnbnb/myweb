package com.lnb.mall.service.impl;

import com.lnb.mall.dao.CategoryDao;
import com.lnb.mall.dao.UserDao;
import com.lnb.mall.model.entity.Category;
import com.lnb.mall.model.entity.User;
import com.lnb.mall.service.intf.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryDao categoryDao;

    @Override
    public boolean addCategory(Integer categoryId,Integer userId,String name,String discription,Double price) {
        int res = categoryDao.insertCategory(categoryId,userId,name,discription,price);
        return res != 0;
    }

    @Override
    public Category queryCategoryByName(String name) {
        return categoryDao.selectCategoryByName(name);
    }
}

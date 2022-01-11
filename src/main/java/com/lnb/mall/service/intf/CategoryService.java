package com.lnb.mall.service.intf;

import com.lnb.mall.model.entity.Category;

public interface CategoryService {
    boolean addCategory(Integer categoryId,Integer userId,String name,String discription,Double price);
    Category queryCategoryByName(String name);
}

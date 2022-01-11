package com.lnb.mall.dao;

import com.lnb.mall.model.entity.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryDao {
    int insertCategory(Integer categoryId,Integer userId,String name,String discription,Double price);
    Category selectCategoryByName(String name);
}

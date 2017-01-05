package com.baike.dao;

import com.baike.model.SubCategory;

public interface SubCategoryMapper {
    int deleteByPrimaryKey(Integer subCategoryId);

    int insert(SubCategory record);

    int insertSelective(SubCategory record);

    SubCategory selectByPrimaryKey(Integer subCategoryId);

    int updateByPrimaryKeySelective(SubCategory record);

    int updateByPrimaryKey(SubCategory record);
}
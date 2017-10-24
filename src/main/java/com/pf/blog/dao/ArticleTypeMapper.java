package com.pf.blog.dao;

import com.pf.blog.entity.ArticleType;

public interface ArticleTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ArticleType record);

    int insertSelective(ArticleType record);

    ArticleType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleType record);

    int updateByPrimaryKeyWithBLOBs(ArticleType record);

    int updateByPrimaryKey(ArticleType record);
}
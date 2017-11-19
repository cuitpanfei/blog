package com.pf.blog.dao;

import com.pf.blog.entity.ArticleType;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleTypeMapper extends IBaseDao<ArticleType> , IBaseSelectiveDao<ArticleType>{
}

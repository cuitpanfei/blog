package com.pf.blog.dao;

import com.pf.blog.entity.Article;
import com.pf.blog.entity.withblobs.ArticleWithBLOBs;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleMapper extends IBaseSelectiveDao<ArticleWithBLOBs>,IBaseDao<ArticleWithBLOBs>{
    
    int updateByPrimaryKeyWithBLOBs(ArticleWithBLOBs record);

    int updateByPrimaryKey(Article record);
}

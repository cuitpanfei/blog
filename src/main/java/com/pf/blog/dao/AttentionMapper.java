package com.pf.blog.dao;

import com.pf.blog.entity.Attention;
import org.springframework.stereotype.Repository;

@Repository
public interface AttentionMapper {
    int deleteByPrimaryKey(Integer attentionId);

    int insert(Attention record);

    int insertSelective(Attention record);

    Attention selectByPrimaryKey(Integer attentionId);

    int updateByPrimaryKeySelective(Attention record);

    int updateByPrimaryKey(Attention record);
}

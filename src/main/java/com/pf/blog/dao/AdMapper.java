package com.pf.blog.dao;

import com.pf.blog.entity.Ad;
import com.pf.blog.entity.AdWithBLOBs;

public interface AdMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdWithBLOBs record);

    int insertSelective(AdWithBLOBs record);

    AdWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AdWithBLOBs record);

    int updateByPrimaryKey(Ad record);
}
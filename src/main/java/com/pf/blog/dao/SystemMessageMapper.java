package com.pf.blog.dao;

import com.pf.blog.entity.SystemMessage;
import com.pf.blog.entity.SystemMessageWithBLOBs;

public interface SystemMessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemMessageWithBLOBs record);

    int insertSelective(SystemMessageWithBLOBs record);

    SystemMessageWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemMessageWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SystemMessageWithBLOBs record);

    int updateByPrimaryKey(SystemMessage record);
}
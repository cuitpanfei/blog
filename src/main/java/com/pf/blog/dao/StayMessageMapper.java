package com.pf.blog.dao;

import com.pf.blog.entity.StayMessage;
import com.pf.blog.entity.StayMessageWithBLOBs;

public interface StayMessageMapper {
    int deleteByPrimaryKey(Integer stayMessageId);

    int insert(StayMessageWithBLOBs record);

    int insertSelective(StayMessageWithBLOBs record);

    StayMessageWithBLOBs selectByPrimaryKey(Integer stayMessageId);

    int updateByPrimaryKeySelective(StayMessageWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(StayMessageWithBLOBs record);

    int updateByPrimaryKey(StayMessage record);
}
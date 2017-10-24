package com.pf.blog.dao;

import com.pf.blog.entity.Replay;

public interface ReplayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Replay record);

    int insertSelective(Replay record);

    Replay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Replay record);

    int updateByPrimaryKeyWithBLOBs(Replay record);

    int updateByPrimaryKey(Replay record);
}
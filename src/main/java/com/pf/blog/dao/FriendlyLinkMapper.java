package com.pf.blog.dao;

import com.pf.blog.entity.FriendlyLink;
import com.pf.blog.entity.withblobs.FriendlyLinkWithBLOBs;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendlyLinkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FriendlyLinkWithBLOBs record);

    int insertSelective(FriendlyLinkWithBLOBs record);

    FriendlyLinkWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FriendlyLinkWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FriendlyLinkWithBLOBs record);

    int updateByPrimaryKey(FriendlyLink record);
}

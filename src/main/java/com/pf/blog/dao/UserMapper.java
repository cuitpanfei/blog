package com.pf.blog.dao;

import com.pf.blog.entity.withblobs.UserWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends IBaseDao<UserWithBLOBs>,IBaseSelectiveDao<UserWithBLOBs>{
    UserWithBLOBs selectByPrimaryKey4Account(@Param("account_id") Integer id);
    UserWithBLOBs selectByName(@Param("name") String name);
}

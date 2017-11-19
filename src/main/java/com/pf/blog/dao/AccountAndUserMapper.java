package com.pf.blog.dao;

import com.pf.blog.entity.withblobs.AccountAndUserWithBLOBs;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountAndUserMapper extends IBaseDao<AccountAndUserWithBLOBs>,IBaseSelectiveDao<AccountAndUserWithBLOBs>{
    /**
     * 用户登陆
     */
    AccountAndUserWithBLOBs login(AccountAndUserWithBLOBs record);
    /**
     * 管理员登陆
     */
    AccountAndUserWithBLOBs adminLogin(AccountAndUserWithBLOBs record);
}

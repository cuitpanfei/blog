package com.pf.blog.service;

import com.pf.blog.entity.withblobs.AccountAndUserWithBLOBs;
import com.pf.blog.entity.withblobs.AccountWithBLOBs;
import com.pf.blog.entity.withblobs.UserWithBLOBs;

public interface IAccountService extends IBaseService<AccountWithBLOBs>{

    AccountAndUserWithBLOBs login(AccountAndUserWithBLOBs userInfoBean);

    UserWithBLOBs getUser(Integer id);

    /** 注册账户信息 */
     int reg(AccountAndUserWithBLOBs userInfoBean);

    void insertUser(UserWithBLOBs user);

    String getUserInfo();
}

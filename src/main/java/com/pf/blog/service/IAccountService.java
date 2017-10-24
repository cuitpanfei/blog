package com.pf.blog.service;

import com.pf.blog.bean.AccountAndUser;
import com.pf.blog.bean.UserInfoBean;
import com.pf.blog.entity.AccountWithBLOBs;
import com.pf.blog.entity.User;
import com.pf.blog.entity.UserWithBLOBs;
import org.springframework.stereotype.Service;

public interface IAccountService extends IBaseService<AccountWithBLOBs>{

    AccountAndUser login(UserInfoBean userInfoBean);

    UserWithBLOBs getUser(Integer id);

    /** 注册账户信息 */
     int reg(UserInfoBean userInfoBean);

    void insertUser(UserWithBLOBs user);
}

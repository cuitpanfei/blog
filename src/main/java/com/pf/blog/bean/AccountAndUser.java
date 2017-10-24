package com.pf.blog.bean;

import com.pf.blog.entity.Account;
import com.pf.blog.entity.AccountWithBLOBs;
import com.pf.blog.entity.User;
import com.pf.blog.entity.UserWithBLOBs;

import static com.pf.blog.util.FormatUtil.ObjToJson;

/**
 * Created by Administrator on 2017/10/23.
 */
public class AccountAndUser {
    private AccountWithBLOBs account;
    private UserWithBLOBs user;

    public AccountAndUser(AccountWithBLOBs account, UserWithBLOBs user){
        this.account = account;
        this.user = user;
    }
    public AccountWithBLOBs getAccount() {
        return account;
    }

    public void setAccount(AccountWithBLOBs account) {
        this.account = account;
    }

    public UserWithBLOBs getUser() {
        return user;
    }

    public void setUser(UserWithBLOBs user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "{"+
                "account:"+ObjToJson(account)+","+
                "user:"+ObjToJson(user)+","
        +"}";
    }
}

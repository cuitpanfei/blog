package com.pf.blog.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Account {
    //账户id
    private Integer accountId;

    //上次登录IP
    private String lastLoginIp;

    //是否锁定
    private String userLock;

    //用户权限
    private String userPower;

    //用户注册时间
    private Date userRegisterTime;

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public void setUserLock(String userLock) {
        this.userLock = userLock == null ? null : userLock.trim();
    }

    public void setUserPower(String userPower) {
        this.userPower = userPower == null ? null : userPower.trim();
    }
}

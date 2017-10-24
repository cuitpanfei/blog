package com.pf.blog.entity;

import java.util.Date;

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

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public String getUserLock() {
        return userLock;
    }

    public void setUserLock(String userLock) {
        this.userLock = userLock == null ? null : userLock.trim();
    }

    public String getUserPower() {
        return userPower;
    }

    public void setUserPower(String userPower) {
        this.userPower = userPower == null ? null : userPower.trim();
    }

    public Date getUserRegisterTime() {
        return userRegisterTime;
    }

    public void setUserRegisterTime(Date userRegisterTime) {
        this.userRegisterTime = userRegisterTime;
    }
}

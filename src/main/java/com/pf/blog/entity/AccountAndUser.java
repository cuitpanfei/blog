package com.pf.blog.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class AccountAndUser {
    private Integer accountId;

    private String lastLoginIp;

    private String userLock;

    private String userPower;

    private Date userRegisterTime;

    private String sex;

    private Integer age;

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public void setUserLock(String userLock) {
        this.userLock = userLock == null ? null : userLock.trim();
    }

    public void setUserPower(String userPower) {
        this.userPower = userPower == null ? null : userPower.trim();
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

}

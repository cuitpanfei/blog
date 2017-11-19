package com.pf.blog.entity.withblobs;

import com.pf.blog.entity.AccountAndUser;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccountAndUserWithBLOBs extends AccountAndUser {
    private String accountNumber;

    private String accountPassword;

    private String username;

    private String headPortrait;

    private String userDescription;

    private String hobbies;

    private String bathday;


    public AccountWithBLOBs accountGet() {
        AccountWithBLOBs account = new AccountWithBLOBs();

        //init account
        account.setAccountId(this.getAccountId());
        account.setLastLoginIp(this.getLastLoginIp());
        account.setUserLock(this.getUserLock());
        account.setUserPower(this.getUserPower());
        account.setUserRegisterTime(this.getUserRegisterTime());

        //init accountWithBLOBs
        account.setAccountNumber(this.getAccountNumber());
        account.setAccountPassword("");
        account.setHeadPortrait(this.getHeadPortrait());
        account.setUserDescription(this.getUserDescription());

        return account;
    }

    public UserWithBLOBs userGet() {
        UserWithBLOBs user = new UserWithBLOBs();

        //init user
        user.setUserid(this.getAccountId());
        user.setUsername(this.getUsername());
        user.setEmail(this.getAccountNumber());
        user.setSex(this.getSex());
        user.setAccountId(this.getAccountId());

        //init userWithBOLBs
        user.setBirthday(this.getBathday());
        user.setHobbies(this.getHobbies());

        return user;
    }
}

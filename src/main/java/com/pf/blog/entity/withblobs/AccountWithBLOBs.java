package com.pf.blog.entity.withblobs;

import com.pf.blog.entity.Account;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountWithBLOBs extends Account {
    //账户名
    private String accountNumber;

    //密码
    private String accountPassword;

    //头像
    private String headPortrait;

    //自我描述
    private String userDescription;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber == null ? null : accountNumber.trim();
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword == null ? null : accountPassword.trim();
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait == null ? null : headPortrait.trim();
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription == null ? null : userDescription.trim();
    }
}

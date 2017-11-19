package com.pf.blog.service.impl.business;

import com.pf.blog.bean.AccountAndUser;
import com.pf.blog.entity.withblobs.AccountAndUserWithBLOBs;
import com.pf.blog.entity.withblobs.UserWithBLOBs;
import com.pf.util.COMM;
import com.pf.util.RegUtils;
import com.pf.util.StringUtil;

import java.util.Date;

import static com.pf.util.FormatUtil.DateToString;
import static com.pf.util.RegUtils.isEmail;

/**
 * Created by cuitpanfei on 2017/10/23.
 */

public class AccountBusiness {

    /**
     *
     * @return 默认用户信息
     */
    public static UserWithBLOBs getDefultUserTemple(AccountAndUser userinfo) {
        UserWithBLOBs user = new UserWithBLOBs();
        user.setAccountId(userinfo.getAccount().getAccountId());
        user.setBirthday(DateToString(userinfo.getAccount().getUserRegisterTime()));
        if(isEmail(userinfo.getAccount().getAccountNumber())){
            user.setEmail(userinfo.getAccount().getAccountNumber());
        }else{
            user.setEmail("");
        }
        user.setUsername(userinfo.getAccount().getAccountNumber());
        return user;
    }

    /**
     * 初始化将要注册的账号的信息
     */
    public void beforReg(AccountAndUserWithBLOBs account) throws LoginRegException {
        if(RegUtils.isNotEmail(account.getAccountNumber())){
            throw new LoginRegException(COMM.ACCOUNT_EMAIL_IS_NOT_EMAIL);
        }else if(StringUtil.isEmpty(account.getUsername())){
            throw new LoginRegException(COMM.ACCOUNT_NAME_IS_NULL);
        }else{
            initAccount(account);
        }

    }

    private void initAccount(AccountAndUserWithBLOBs account){
        account.setUserRegisterTime(new Date());//初始化账号注册时间
        account.setUserLock("1");               //刚注册账号是被锁定的
        account.setUserPower("0");              //刚注册账号的权限
    }
    /**
     * 初始化将要登录的账号的信息
     */
    public void beforLogin(AccountAndUserWithBLOBs accountAndUser){
        if(RegUtils.isEmail(accountAndUser.getAccountNumber())){
            accountAndUser.setUsername(null);
        }else if(StringUtil.isEmpty(accountAndUser.getAccountNumber())){//如果账号为空，说明用户没有输入账号（这种情况一般比较少见，除了恶意的之外，所以这个条件放在第二步判断）
            throw new LoginRegException(COMM.ACCOUNT_NAME_IS_NONEXISTENT);
        }else{
            accountAndUser.setUsername(accountAndUser.getAccountNumber());
            accountAndUser.setAccountNumber(null);
        }
    }
}

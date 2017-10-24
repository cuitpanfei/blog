package com.pf.blog.service.impl.business;

import com.pf.blog.bean.AccountAndUser;
import com.pf.blog.bean.UserInfoBean;
import com.pf.blog.entity.AccountWithBLOBs;
import com.pf.blog.entity.UserWithBLOBs;
import com.pf.blog.service.impl.AccountServiceImpl;
import com.pf.blog.util.Util;
import com.pf.blog.util.custom.exception.AccountException;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.Date;

import static com.pf.blog.util.COMM.LOGIN_ERROR;
import static com.pf.blog.util.COMM.Perfected_personal_information;
import static com.pf.blog.util.FormatUtil.DateToString;
import static com.pf.blog.util.RegUtils.isEmail;

/**
 * Created by cuitpanfei on 2017/10/23.
 */

public class AccountBusiness {

    /**
     * 初始化用户信息
     *
     * @param userInfo 用户信息
     */
    public void initUser(AccountAndUser userInfo,AccountServiceImpl userAccountService) throws AccountException {
        if(userInfo.getAccount()==null){
            throw new AccountException("账号信息在数据库中不存在："+userInfo.toString());
        }else if(("").equals(userInfo.getAccount().getUserPower())){
            throw new AccountException("账号信息权限存在非法："+userInfo.toString());
        }
        userInfo.getAccount().setAccountPassword("");
        if (userInfo.getAccount().getUserPower() == Perfected_personal_information) {//如果用户没有完善个人信息
            userInfo.setUser(getDefultUserTemple(userInfo));
        }else{
            userInfo.setUser(userAccountService.getUser(userInfo.getAccount().getAccountId()));
            if(userInfo.getUser().getUserid()!=userInfo.getAccount().getAccountId()){//如果用户ID与账号ID不同
                throw new AccountException("账号信息存在异常，可能加载了错误的数据："+userInfo.toString());
            }
        }
    }


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
     * 通过userInfoBean的信息去完善Account中的信息
     */
    public void initAccount4InsertByUserInfoBean(AccountWithBLOBs account, UserInfoBean userInfoBean) {
        account.setAccountId(Util.getKey());
        account.setAccountNumber(userInfoBean.getEmail());
        account.setAccountPassword(userInfoBean.getPassword());
        initAccount4Insert(account);
    }

    /**
     * 初始化将要注册的账号的信息
     */
    public void initAccount4Insert(AccountWithBLOBs account) {
        account.setUserRegisterTime(new Date());//初始化账号注册时间
        account.setUserLock("1");               //刚注册账号是被锁定的
        account.setUserPower("0");              //刚注册账号的权限
    }
}

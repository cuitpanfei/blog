package com.pf.blog.service.impl;

import com.pf.blog.bean.AccountAndUser;
import com.pf.blog.bean.UserInfoBean;
import com.pf.blog.dao.AccountMapper;
import com.pf.blog.dao.UserMapper;
import com.pf.blog.entity.AccountWithBLOBs;
import com.pf.blog.entity.User;
import com.pf.blog.entity.UserWithBLOBs;
import com.pf.blog.service.IAccountService;
import com.pf.blog.service.impl.business.AccountBusiness;
import com.pf.blog.util.Util;
import com.pf.blog.util.custom.exception.AccountException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.Date;

import static com.pf.blog.util.COMM.LOGIN_ERROR;

@Service("userAccountService")
public class AccountServiceImpl extends BaseServiceImpl implements IAccountService {
    @Autowired
    private AccountMapper accountDao;
    @Autowired
    private UserMapper userDao;

    @Autowired
    private HttpSession session;

    @Autowired
    private HttpServletRequest request;

    private AccountBusiness accountBusiness = new AccountBusiness();

    public int deleteByPrimaryKey(Integer id) {
        return accountDao.deleteByPrimaryKey(id);
    }

    /**
     * 插入账号信息
     */
    public int insert(AccountWithBLOBs account){
        return accountDao.insertSelective(account);
    }

    /**
     * 注册账户信息
     */
    public int reg(UserInfoBean userInfoBean) {
        AccountAndUser accountAndUser = new AccountAndUser(new AccountWithBLOBs(),new UserWithBLOBs());
        accountAndUser.getUser().setUsername(userInfoBean.getUsername());
        accountBusiness.initAccount4InsertByUserInfoBean(accountAndUser.getAccount(),userInfoBean);
        insertUser(accountAndUser.getUser());
        return insert(accountAndUser.getAccount());
    }

    /**
     * 更新账号信息
     */
    public int updateByPrimaryKey(AccountWithBLOBs entity) {
        return this.accountDao.updateByPrimaryKey(entity);
    }

    /**
     * 用户登陆
     */
    @Transactional
    public AccountAndUser login(UserInfoBean userInfoBean) {
        AccountWithBLOBs account = this.accountDao.login(userInfoBean.getEmail(), userInfoBean.getPassword());
        AccountAndUser accountAndUser = new AccountAndUser(account,new UserWithBLOBs());
        try {
            accountBusiness.initUser(accountAndUser,this);
            session.invalidate();
            session.setAttribute("userinfo",accountAndUser);
            LOGGER.info("加载用户信息成功，"+accountAndUser.toString());
        } catch (AccountException e) {
            LOGGER.info("加载用户信息失败，"+accountAndUser.toString());
            accountAndUser.setUser(null);
            request.setAttribute("error_msg", LOGIN_ERROR);
            session.invalidate();
            e.printStackTrace();
        }
        return accountAndUser;
    }

    /**
     * 查询账号信息
     */
    public AccountWithBLOBs getObjectById(Integer id) {
        return this.accountDao.selectByPrimaryKey(id);
    }

    /**
     * 获取用户信息
     */
    public UserWithBLOBs getUser(Integer id) {
        return this.userDao.selectByPrimaryKey(id);
    }

    /**
     * 插入用户信息
     */
    public void insertUser(UserWithBLOBs user) {
        this.userDao.insert(user);
    }
}

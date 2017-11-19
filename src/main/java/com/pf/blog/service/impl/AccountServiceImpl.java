package com.pf.blog.service.impl;

import com.pf.blog.dao.AccountAndUserMapper;
import com.pf.blog.dao.AccountMapper;
import com.pf.blog.dao.UserMapper;
import com.pf.blog.entity.withblobs.AccountAndUserWithBLOBs;
import com.pf.blog.entity.withblobs.AccountWithBLOBs;
import com.pf.blog.entity.withblobs.UserWithBLOBs;
import com.pf.blog.service.IAccountService;
import com.pf.blog.service.impl.business.AccountBusiness;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.pf.util.COMM.LOGIN_ERROR;
import static com.pf.util.COMM.LOGIN_PLEASE;
import static com.pf.util.StringUtil.isNotEmpty;
import static com.pf.util.Util.getIp;

@Service("userAccountService")
@Log4j
public class AccountServiceImpl extends BaseServiceImpl implements IAccountService {
    @Autowired
    private AccountMapper accountDao;
    @Autowired
    private AccountAndUserMapper accountAndUserDao;
    @Autowired
    private UserMapper userDao;

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
    public int reg(AccountAndUserWithBLOBs userInfoBean) {
        try {
            accountBusiness.beforReg(userInfoBean);
            insertUser(userInfoBean.userGet());
            return insert(userInfoBean.accountGet());
        }catch (Exception e){//插入数据遇见异常，删除脏数据
            UserWithBLOBs user = this.userDao.selectByPrimaryKey4Account(userInfoBean.getAccountId());
            AccountWithBLOBs account = this.accountDao.selectByPrimaryKey(userInfoBean.getAccountId());

            //由于用户信息是根据账号ID查出来的，可能查出非脏数据
            if(user!=null&&user.equals(userInfoBean.userGet())){
                this.userDao.deleteByPrimaryKey(user.getUserid());
            }

            if(account!=null){
                this.userDao.deleteByPrimaryKey(account.getAccountId());
            }
        }
        return -1;
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
    public AccountAndUserWithBLOBs login(AccountAndUserWithBLOBs accountAndUser) {
        boolean hasError = false;
        try {
            accountBusiness.beforLogin(accountAndUser);//如果出错，抛出 LoginException 异常
            accountAndUser = this.accountAndUserDao.login(accountAndUser);
            if(isNotEmpty(accountAndUser.getLastLoginIp()) && !getIp(request).equals(accountAndUser.getLastLoginIp())){
                accountAndUser.setLastLoginIp(getIp(request));
                this.accountDao.updateIP(accountAndUser.accountGet());
            }
            log.info("加载用户信息成功，"+accountAndUser.toString());
        } catch (LoginRegException e){
            log.error("加载用户信息失败，"+accountAndUser.toString());
            accountAndUser=null;
        }catch (Exception e) {
            log.error("加载用户信息失败，"+accountAndUser.toString());
            hasError = true;
            accountAndUser=null;
            e.printStackTrace();
        } finally {
            session.invalidate();
            if(hasError){ session.setAttribute("error_msg", LOGIN_ERROR); }
            session.setAttribute("userinfo",accountAndUser);
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

    /**
     * 查看用户信息
     */
    public String getUserInfo() {
        String returnStr = session.getAttribute("userinfo")==null?"redirect:/":"showUser";
        if("redirect:/".equals(returnStr)){
            session.invalidate();
            session.setAttribute("err_msg",LOGIN_PLEASE);
        }
        return returnStr;
    }
}

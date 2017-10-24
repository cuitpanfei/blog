package com.pf.blog.dao;

import com.pf.blog.entity.Account;
import com.pf.blog.entity.AccountWithBLOBs;
import com.pf.blog.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMapper extends IBaseDao<AccountWithBLOBs>, IBaseSelectiveDao<AccountWithBLOBs>{
    /**
     * @param accountNumber    邮箱
     * @param accountPassword  密码
     * @return
     */
    AccountWithBLOBs login(@Param("accountNumber") String accountNumber, @Param("accountPassword") String accountPassword);
}

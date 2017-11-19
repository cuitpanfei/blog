package com.pf.blog.dao;

import com.pf.blog.entity.withblobs.AccountWithBLOBs;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMapper extends IBaseDao<AccountWithBLOBs>, IBaseSelectiveDao<AccountWithBLOBs>{
    void updateIP(AccountWithBLOBs accountWithBLOBs);
}

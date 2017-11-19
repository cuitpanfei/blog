package com.pf.admin.service;

import com.pf.blog.bean.SearchResults;
import com.pf.blog.dao.*;
import com.pf.blog.entity.withblobs.AccountAndUserWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cuitpanfei on 2017/11/1.
 */
public interface IAdminService {

    AccountAndUserWithBLOBs adminLogin(AccountAndUserWithBLOBs userInfoBean);

    SearchResults searchResults(String search);
}

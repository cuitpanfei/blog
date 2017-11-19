package com.pf.admin.service.impl;

import com.pf.admin.service.IAdminService;
import com.pf.blog.bean.SearchResults;
import com.pf.blog.dao.*;
import com.pf.blog.entity.ArticleType;
import com.pf.blog.entity.withblobs.AccountAndUserWithBLOBs;
import com.pf.blog.service.impl.BaseServiceImpl;
import com.pf.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.pf.util.COMM.ADMIN_LOGIN_ERROR_MSG;
import static com.pf.util.StringUtil.isNotEmpty;

/**
 * Created by cuitpanfei on 2017/11/1.
 */
@Service("adminService")
public class AdminServiceImpl extends BaseServiceImpl implements IAdminService {

    @Autowired
    private AccountAndUserMapper adminDao;
    @Autowired
    private ArticleMapper articleDao;
    @Autowired
    private ArticleTypeMapper articleTypeDao;
    @Autowired
    private ScheduleMapper scheduleDao;
    @Autowired
    private ReplayMapper replayDao;

    public AccountAndUserWithBLOBs adminLogin(AccountAndUserWithBLOBs userInfoBean) {
        session.setAttribute("admin_login_error_msg",ADMIN_LOGIN_ERROR_MSG);
        try{
            userInfoBean = adminDao.adminLogin(userInfoBean);
            if(userInfoBean!=null){
                session.removeAttribute("admin_login_error_msg");
                session.setAttribute("admin",userInfoBean);
            }
        }catch(Exception e){
            LOGGER.info("管理员登陆异常");
        }
        return userInfoBean;
    }

    @Override
    public SearchResults searchResults(String _search) {
        SearchResults searchResults = new SearchResults();
        searchResults.setArticleList(articleDao.selectBySearch(_search));
        searchResults.setArticleTypeList(articleTypeDao.selectBySearch(_search));
        searchResults.setReplayList(replayDao.selectBySearch(_search));
        searchResults.setScheduleList(scheduleDao.selectBySearch(_search));
        return searchResults;
    }
}

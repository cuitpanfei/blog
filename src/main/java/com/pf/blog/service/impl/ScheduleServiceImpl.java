package com.pf.blog.service.impl;

import com.pf.blog.bean.AccountAndUser;
import com.pf.blog.dao.ScheduleMapper;
import com.pf.blog.entity.Schedule;
import com.pf.blog.entity.withblobs.AccountWithBLOBs;
import com.pf.blog.service.IScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.pf.util.LoggerMessageUtil.creatInfo;

@Service("scheduleService")
public class ScheduleServiceImpl extends BaseServiceImpl implements IScheduleService {

    @Autowired
    private ScheduleMapper ScheduleDao;
    /**
     * Get Schedule of one User By who's id;
     *
     * @param accountWithBLOBs
     * @return
     */
    public List<Schedule> getEvents(AccountWithBLOBs accountWithBLOBs) {
        List list = null;
        if(accountWithBLOBs.getAccountId() > 0){
            list = this.ScheduleDao.selectOneUserAllEvents(accountWithBLOBs.getAccountId());
            session.setAttribute("Events",list);
        }
        return list;
    }

    public void removeALL() {
        AccountAndUser accountAndUser = (AccountAndUser)session.getAttribute("userinfo");
        LOGGER.info(creatInfo(accountAndUser.getAccount().getAccountId(),"开始删除自己所有的日程安排"));
        try{
            this.ScheduleDao.removeAll(accountAndUser.getAccount().getAccountId());
            session.removeAttribute("Events");
        }catch (Exception e){
            LOGGER.error(creatInfo(accountAndUser.getAccount().getAccountId(),"遇到异常情况，中断操作"));
        }
        LOGGER.info(creatInfo(accountAndUser.getAccount().getAccountId(),"删除自己所有的日程安排完成"));
    }

    public Schedule getObjectById(Integer id) {
        return null;
    }

    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(Schedule entity) {
        return 0;
    }

    public int updateByPrimaryKey(Schedule entity) {
        return 0;
    }
}

package com.pf.blog.service.impl;

import com.pf.blog.dao.ScheduleMapper;
import com.pf.blog.entity.Schedule;
import com.pf.blog.service.IScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service("scheduleService")
public class ScheduleServiceImpl extends BaseServiceImpl implements IScheduleService {

    @Autowired
    private ScheduleMapper ScheduleDao;
    /**
     * Get Schedule of one User By who's id;
     *
     * @param id
     * @return
     */
    public List<Schedule> getEvents(Serializable id) {
        return this.ScheduleDao.selectOneUserAllEvents((Integer) id);
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

package com.pf.blog.dao;

import com.pf.blog.entity.Schedule;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface ScheduleMapper {
    int deleteByPrimaryKey(Integer scheduleId);

    int insert(Schedule record);

    int insertSelective(Schedule record);

    Schedule selectByPrimaryKey(Integer scheduleId);

    int updateByPrimaryKeySelective(Schedule record);

    int updateByPrimaryKeyWithBLOBs(Schedule record);

    int updateByPrimaryKey(Schedule record);

    List<Schedule> selectOneUserAllEvents(Integer id);
}

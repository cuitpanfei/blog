package com.pf.blog.dao;

import com.pf.blog.entity.Schedule;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface ScheduleMapper extends IBaseDao<Schedule>,IBaseSelectiveDao<Schedule> {

    int updateByPrimaryKeyWithBLOBs(Schedule record);

    List<Schedule> selectOneUserAllEvents(Integer id);

    /** 清空当前用户的所有Schedule */
    void removeAll(@Param("accountId") Integer accountId);
}

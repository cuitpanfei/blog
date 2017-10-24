package com.pf.blog.service;

import com.pf.blog.entity.Schedule;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

public interface IScheduleService extends IBaseService<Schedule> {
    /**
     * Get Schedule of one User By who's id;
     *
     * @param id
     * @return
     */
    List<Schedule> getEvents(Serializable id);
}

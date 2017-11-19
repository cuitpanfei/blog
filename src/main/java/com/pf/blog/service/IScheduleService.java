package com.pf.blog.service;

import com.pf.blog.entity.Schedule;
import com.pf.blog.entity.withblobs.AccountWithBLOBs;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

public interface IScheduleService extends IBaseService<Schedule> {


    void removeALL();
    /**
     * Get Schedule of accountWithBLOBs;
     *
     * @param accountWithBLOBs
     * @return
     */
    List<Schedule> getEvents(AccountWithBLOBs accountWithBLOBs);
}

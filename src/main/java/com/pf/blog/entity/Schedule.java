package com.pf.blog.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Schedule {
    private Integer scheduleId;
    private Date creatDate;
    private Integer accountId;
    private String scheduleContent;

    public void setScheduleContent(String scheduleContent) {
        this.scheduleContent = scheduleContent == null ? null : scheduleContent.trim();
    }
}

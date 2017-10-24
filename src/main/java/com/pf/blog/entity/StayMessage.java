package com.pf.blog.entity;

import java.util.Date;

public class StayMessage {
    private Integer stayMessageId;

    private Date createTime;

    private String ipv4Info;

    public Integer getStayMessageId() {
        return stayMessageId;
    }

    public void setStayMessageId(Integer stayMessageId) {
        this.stayMessageId = stayMessageId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIpv4Info() {
        return ipv4Info;
    }

    public void setIpv4Info(String ipv4Info) {
        this.ipv4Info = ipv4Info == null ? null : ipv4Info.trim();
    }
}
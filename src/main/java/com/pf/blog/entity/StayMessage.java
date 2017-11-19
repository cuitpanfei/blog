package com.pf.blog.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class StayMessage {
    private Integer stayMessageId;
    private Date createTime;
    private String ipv4Info;

    public void setIpv4Info(String ipv4Info) {
        this.ipv4Info = ipv4Info == null ? null : ipv4Info.trim();
    }
}

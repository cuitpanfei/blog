package com.pf.blog.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class SystemMessage {
    private Integer id;
    private Date sendTime;
}

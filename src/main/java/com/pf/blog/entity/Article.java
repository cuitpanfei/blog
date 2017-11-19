package com.pf.blog.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Article {
    private Integer id;

    private Integer accountId;

    private Date articleCreatTime;

    private Integer articleTypeId;

}

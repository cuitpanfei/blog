package com.pf.blog.entity;

import java.util.Date;

public class Article {
    private Integer id;

    private Integer accountId;

    private Date articleCreatTime;

    private Integer articleTypeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Date getArticleCreatTime() {
        return articleCreatTime;
    }

    public void setArticleCreatTime(Date articleCreatTime) {
        this.articleCreatTime = articleCreatTime;
    }

    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }
}
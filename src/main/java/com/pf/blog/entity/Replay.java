package com.pf.blog.entity;

import java.util.Date;

public class Replay {
    private Integer id;

    private Integer accountId;

    private Integer accAccountId;

    private Date replayTime;

    private Integer replayTypr;

    private Integer articleId;

    private String replayContent;

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

    public Integer getAccAccountId() {
        return accAccountId;
    }

    public void setAccAccountId(Integer accAccountId) {
        this.accAccountId = accAccountId;
    }

    public Date getReplayTime() {
        return replayTime;
    }

    public void setReplayTime(Date replayTime) {
        this.replayTime = replayTime;
    }

    public Integer getReplayTypr() {
        return replayTypr;
    }

    public void setReplayTypr(Integer replayTypr) {
        this.replayTypr = replayTypr;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getReplayContent() {
        return replayContent;
    }

    public void setReplayContent(String replayContent) {
        this.replayContent = replayContent == null ? null : replayContent.trim();
    }
}
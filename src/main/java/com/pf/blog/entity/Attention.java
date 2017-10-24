package com.pf.blog.entity;

public class Attention {
    private Integer attentionId;

    private Integer accountId;

    private String attentionType;

    public Integer getAttentionId() {
        return attentionId;
    }

    public void setAttentionId(Integer attentionId) {
        this.attentionId = attentionId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAttentionType() {
        return attentionType;
    }

    public void setAttentionType(String attentionType) {
        this.attentionType = attentionType == null ? null : attentionType.trim();
    }
}
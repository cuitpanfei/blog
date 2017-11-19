package com.pf.blog.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Attention {
    private Integer attentionId;
    private Integer accountId;
    private String attentionType;

    public void setAttentionType(String attentionType) {
        this.attentionType = attentionType == null ? null : attentionType.trim();
    }
}

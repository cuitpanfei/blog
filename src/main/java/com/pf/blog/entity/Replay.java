package com.pf.blog.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Replay {
    private Integer id;
    private Integer accountId;
    private Integer accAccountId;
    private Date replayTime;
    private Integer replayTypr;
    private Integer articleId;
    private String replayContent;

    public void setReplayContent(String replayContent) {
        this.replayContent = replayContent == null ? null : replayContent.trim();
    }
}

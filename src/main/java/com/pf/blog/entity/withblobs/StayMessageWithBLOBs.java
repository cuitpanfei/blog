package com.pf.blog.entity.withblobs;

import com.pf.blog.entity.StayMessage;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StayMessageWithBLOBs extends StayMessage {
    private String content;

    private String email;

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}

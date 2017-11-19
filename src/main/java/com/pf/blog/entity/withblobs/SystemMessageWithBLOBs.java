package com.pf.blog.entity.withblobs;

import com.pf.blog.entity.SystemMessage;

public class SystemMessageWithBLOBs extends SystemMessage {
    private String systemTopic;

    private String systemContent;

    public void setSystemTopic(String systemTopic) {
        this.systemTopic = systemTopic == null ? null : systemTopic.trim();
    }

    public void setSystemContent(String systemContent) {
        this.systemContent = systemContent == null ? null : systemContent.trim();
    }
}

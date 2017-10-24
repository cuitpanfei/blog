package com.pf.blog.entity;

public class SystemMessageWithBLOBs extends SystemMessage {
    private String systemTopic;

    private String systemContent;

    public String getSystemTopic() {
        return systemTopic;
    }

    public void setSystemTopic(String systemTopic) {
        this.systemTopic = systemTopic == null ? null : systemTopic.trim();
    }

    public String getSystemContent() {
        return systemContent;
    }

    public void setSystemContent(String systemContent) {
        this.systemContent = systemContent == null ? null : systemContent.trim();
    }
}
package com.pf.blog.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Ad {
    private Integer id;

    private String mediaType;

    private String name;

    private Integer clickCount;

    private String enabled;


    public void setMediaType(String mediaType) {
        this.mediaType = mediaType == null ? null : mediaType.trim();
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled == null ? null : enabled.trim();
    }
}

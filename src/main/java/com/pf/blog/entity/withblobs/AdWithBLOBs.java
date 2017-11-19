package com.pf.blog.entity.withblobs;

import com.pf.blog.entity.Ad;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AdWithBLOBs extends Ad {
    private String link;

    private String code;

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}

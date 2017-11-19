package com.pf.blog.entity.withblobs;

import com.pf.blog.entity.FriendlyLink;

public class FriendlyLinkWithBLOBs extends FriendlyLink {
    private String url;

    private String logo;

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }
}

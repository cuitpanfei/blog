package com.pf.blog.entity;

public class FriendlyLinkWithBLOBs extends FriendlyLink {
    private String url;

    private String logo;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }
}
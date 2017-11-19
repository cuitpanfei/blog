package com.pf.blog.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private Integer userid;

    private Integer accountId;

    private String username;

    private String sex;

    private String email;

    private Integer age;

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}

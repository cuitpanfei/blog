package com.pf.blog.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ArticleType {
    private Integer id;
    private Integer typeParentId;
    private Integer typeChildrenId;
    private Integer typeLevel;
    private String typeName;

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }
}

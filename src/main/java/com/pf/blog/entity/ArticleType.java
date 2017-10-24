package com.pf.blog.entity;

public class ArticleType {
    private Integer id;

    private Integer typeParentId;

    private Integer typeChildrenId;

    private Integer typeLevel;

    private String typeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeParentId() {
        return typeParentId;
    }

    public void setTypeParentId(Integer typeParentId) {
        this.typeParentId = typeParentId;
    }

    public Integer getTypeChildrenId() {
        return typeChildrenId;
    }

    public void setTypeChildrenId(Integer typeChildrenId) {
        this.typeChildrenId = typeChildrenId;
    }

    public Integer getTypeLevel() {
        return typeLevel;
    }

    public void setTypeLevel(Integer typeLevel) {
        this.typeLevel = typeLevel;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }
}
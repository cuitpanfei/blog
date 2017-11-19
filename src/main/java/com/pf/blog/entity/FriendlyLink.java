package com.pf.blog.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FriendlyLink {
    private Integer id;
    private String name;
    private String showOrder;

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public void setShowOrder(String showOrder) {
        this.showOrder = showOrder == null ? null : showOrder.trim();
    }
}

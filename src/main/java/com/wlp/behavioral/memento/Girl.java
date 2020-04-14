package com.wlp.behavioral.memento;

/**
 *
 * 备忘录角色
 *
 *美女
 */
public class Girl {
    private String name ;

    public Girl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

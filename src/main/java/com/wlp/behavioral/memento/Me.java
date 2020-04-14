package com.wlp.behavioral.memento;

/**
 * 发起人角色
 *
 * 我
 */
public class Me {
    private String wifeName ;

    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifeName) {
        this.wifeName = wifeName;
    }

    public Girl createMemento(){
        return new Girl(wifeName);
    }

    public void restoreMemento(Girl girl){
        setWifeName(girl.getName());
    }
}

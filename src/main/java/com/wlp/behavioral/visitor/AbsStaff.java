package com.wlp.behavioral.visitor;

/**
 * 抽象员工类
 */
public abstract class AbsStaff {
    protected String name ;

    public int kpi ;

    public AbsStaff(String name) {
        this.name = name;
        this.kpi = (int) (Math.random()*10);
    }

    protected abstract void accept(IVisitor visitor);
}

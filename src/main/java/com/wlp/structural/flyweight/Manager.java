package com.wlp.structural.flyweight;


/**
 具体享元类
 */
public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println(this.reportContent);
    }

    private String department ;


    /**
     *
     * 所以根据项目实际要求来看时，有的享元模式例子中至少会有3个类，有的有4个类
     * 3个类：抽象享元角色，具体享元角色，享元工厂角色，非享元角色(不是以类展现，如下所示)
     * 4个类：抽象享元角色，具体享元角色，享元工厂角色，非享元角色 ，都是以类展现
     *
     * 非享元角色是不可以共享的外部状态，它以【参数的形式】注入具体享元的相关方法中。
     *
     */
    //这个就是非共享的外部状态（可以是一个字段，可以是一个类）
    private String reportContent;

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }
}

package com.wlp.behavioral.mediator;

/**
 * 抽象顾客
 */
public abstract class Customer {

    //顾客名称
    protected String name ;
    //所属中介者
    protected Medium medium ;

    public Customer(String name) {
        this.name = name;
    }

    //发送消息
    protected abstract void send(String msg);
    //
    protected abstract void receive(String fromName,String msg);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }
}

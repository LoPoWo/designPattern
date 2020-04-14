package com.wlp.behavioral.mediator;

/**
 * 顾客，买方
 */
public class Buyer extends Customer {

    public Buyer(String name) {
        super(name);
    }

    protected void send(String msg) {
        System.out.println("我（买方）说："+msg);
        medium.replay(name,msg);
    }

    protected void receive(String fromName, String msg) {
        System.out.println(fromName+"说："+msg);
    }
}

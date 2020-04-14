package com.wlp.behavioral.mediator;

/**
 * 顾客，卖方
 */
public class Seller extends Customer {
    public Seller(String name) {
        super(name);
    }

    protected void send(String msg) {
        System.out.println("我（卖方）说："+msg);
        medium.replay(name,msg);
    }

    protected void receive(String fromName, String msg) {
        System.out.println(fromName+"说："+msg);
    }
}

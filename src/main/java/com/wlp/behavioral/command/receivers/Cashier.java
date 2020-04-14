package com.wlp.behavioral.command.receivers;

/**
 * 具体接收者，收银员
 */
public class Cashier implements IReceiver{
    public void exec() {
        System.out.println("接受者=>收银员=>结账");
    }
}

package com.wlp.behavioral.command.receivers;

/**
 * 服务员
 */
public class Waiter implements IReceiver{
    public void exec() {
        System.out.println("接收者=>服务员=>点餐");
    }
}

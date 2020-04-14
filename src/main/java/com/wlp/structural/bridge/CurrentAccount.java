package com.wlp.structural.bridge;

public class CurrentAccount implements IAccount {
    @Override
    public void getDesc() {
        System.out.println("活期账户");
    }

    @Override
    public IAccount openAccount() {
        System.out.println("这是一个活期账户");
        return new CurrentAccount();
    }
}

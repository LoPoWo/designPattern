package com.wlp.structural.bridge;

public class DepositAccount implements IAccount {
    @Override
    public void getDesc() {
        System.out.println("定期账户");
    }

    @Override
    public IAccount openAccount() {
        System.out.println("这是一个定期账户");
        return new DepositAccount();
    }
}

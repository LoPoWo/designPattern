package com.wlp.structural.bridge;

public class AbcBank extends AbsBank {

    public AbcBank(IAccount iAccount) {
        super(iAccount);
    }
    @Override
    protected IAccount openBankAccount() {
        System.out.println("打开一个中国农业银行账户");
        account.openAccount();
        System.out.println();//换行，美观
        return account;
    }
}

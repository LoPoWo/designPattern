package com.wlp.structural.bridge;

public class IcbcBank extends AbsBank {
    public IcbcBank(IAccount account) {
        super(account);
    }

    @Override
    protected IAccount openBankAccount() {
        System.out.println("打开一个中国工商银行账户");

        //一定要将真实操作委托给抽象类注入的对象，才有意义，这才是桥接的精华所在
        account.openAccount();
        System.out.println();//换行，美观
        return account;
    }
}

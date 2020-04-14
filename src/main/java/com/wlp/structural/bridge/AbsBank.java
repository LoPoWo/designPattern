package com.wlp.structural.bridge;

public abstract class AbsBank {

    protected IAccount account ;

    public AbsBank(IAccount account) {
        this.account = account;
    }

    protected abstract IAccount openBankAccount();
}

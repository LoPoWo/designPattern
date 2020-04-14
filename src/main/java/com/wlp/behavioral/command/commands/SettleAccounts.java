package com.wlp.behavioral.command.commands;

import com.wlp.behavioral.command.receivers.Cashier;
import com.wlp.behavioral.command.receivers.IReceiver;

/**
 * 结账
 */
public class SettleAccounts implements ICommand {
    //接收者
    private IReceiver receiver ;

    public SettleAccounts() {
        receiver = new Cashier();
    }

    public void exec() {
        receiver.exec();
    }
}

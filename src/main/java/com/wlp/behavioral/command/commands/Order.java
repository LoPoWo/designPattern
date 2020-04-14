package com.wlp.behavioral.command.commands;

import com.wlp.behavioral.command.receivers.IReceiver;
import com.wlp.behavioral.command.receivers.Waiter;

/**
 * 具体命令，点餐
 */
public class Order implements ICommand {

    private IReceiver receiver ;

    public Order() {
        receiver = new Waiter();
    }

    public void exec() {
        receiver.exec();
    }
}

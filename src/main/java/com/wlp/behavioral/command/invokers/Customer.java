package com.wlp.behavioral.command.invokers;

import com.wlp.behavioral.command.commands.ICommand;

/**
 * 顾客
 */
public class Customer extends AbsInvoker{
    public Customer(String name ,ICommand command) {
        super(name,command);
    }
}

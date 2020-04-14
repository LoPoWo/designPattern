package com.wlp.behavioral.command.invokers;

import com.wlp.behavioral.command.commands.ICommand;

/**
 * 具体调用者，店老板
 */
public class Boss extends AbsInvoker{
    public Boss(String name,ICommand command) {
        super(name,command);
    }
}

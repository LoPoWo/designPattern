package com.wlp.behavioral.command.invokers;

import com.wlp.behavioral.command.commands.ICommand;

/**
 * 抽象调用者
 */
public abstract class AbsInvoker {
    protected String name ;
    protected ICommand command ;

    public AbsInvoker(String name ,ICommand command) {
        this.name = name ;
        this.command = command;
    }

    public final void call(){
        System.out.println(name+"调用命令开始");
        this.command.exec();
    }
}

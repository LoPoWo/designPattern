package com.wlp.behavioral.chainofresponsibility.v0;

/**
 * 抽象处理者
 */
public abstract class AbsHandler {

    private AbsHandler next ;

    public AbsHandler getNext() {
        return next;
    }

    public void setNext(AbsHandler next) {
        this.next = next;
    }

    protected abstract void handle(String msg);
}

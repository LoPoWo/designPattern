package com.wlp.behavioral.mediator;

/**
 * 抽象中介者
 */
public interface Medium {

    //注册
    boolean register(Customer customer);
    //转发
    void replay(String fromName,String content);
}

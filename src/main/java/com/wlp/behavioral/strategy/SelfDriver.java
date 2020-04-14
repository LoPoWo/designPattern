package com.wlp.behavioral.strategy;

/**
 * 自驾
 */
public class SelfDriver implements ITripMode{
    public void getOut() {
        System.out.println("自驾");
    }
}

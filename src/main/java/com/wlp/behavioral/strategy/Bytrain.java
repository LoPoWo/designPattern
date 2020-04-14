package com.wlp.behavioral.strategy;

/**
 * 坐火车
 */
public class Bytrain implements ITripMode{
    public void getOut() {
        System.out.println("坐火车");
    }
}

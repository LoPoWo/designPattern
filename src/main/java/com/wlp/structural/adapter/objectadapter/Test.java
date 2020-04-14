package com.wlp.structural.adapter.objectadapter;

/***
 * 类适配器方式
 */
public class Test {
    public static void main(String[] args) {
        ITarget adapterTarget = new Adapter();
        adapterTarget.requst();
    }
}

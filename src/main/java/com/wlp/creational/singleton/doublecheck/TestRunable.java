package com.wlp.creational.singleton.doublecheck;

/**
 * 测试多线程
 */
public class TestRunable implements Runnable {
    public void run() {
        Earth instance = Earth.getInstance();
        System.out.println(Thread.currentThread().getId()+"--"+instance);
    }
}

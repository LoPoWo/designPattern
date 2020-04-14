package com.wlp.structural.adapter;

/**
 * 被适配者，电源220V
 */
public class Power220V {
    public int output(){

        System.out.println("输入220V交流电");
        return 220;
    }
}

package com.wlp.structural.adapter;

/**
 * 适配器
 */
public class Power20VAdapter implements IComputerPowerTarget {

    //被适配者
    private Power220V power220V ;

    public Power20VAdapter() {
        this.power220V = new Power220V() ;
    }

    @Override
    public int charge() {
        int output = this.power220V.output();
        System.out.println("适配器进行变压...");
        System.out.println("输出20V直流电");
        return 20 ;
    }
}

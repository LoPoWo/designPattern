package com.wlp.structural.decorator;

public class BmwCar extends AbsCar {
    @Override
    protected String getDesc() {
        return "宝马745";
    }

    @Override
    protected int getMoney() {
        return 5000000;
    }
}

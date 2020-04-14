package com.wlp.creational.builder;

public class FerrariBuilder extends AbsCarBuilder {
    public void buildEngine() {
        car.setEngine("法拉利引擎");
    }

    public void buildWheel() {
        car.setWheel("法拉利车轮");
    }

    public void buildTeeringWheel() {
        car.setTeeringWheel("法拉利方向盘");
    }
}

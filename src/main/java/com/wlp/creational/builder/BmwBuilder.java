package com.wlp.creational.builder;

/**
 * 具体建造者，宝马车建造者
 */
public class BmwBuilder extends AbsCarBuilder {
    public void buildEngine() {
        car.setEngine("宝马引擎");
    }

    public void buildWheel() {
        car.setWheel("宝马车轮");
    }

    public void buildTeeringWheel() {
        car.setTeeringWheel("宝马方向盘");
    }
}

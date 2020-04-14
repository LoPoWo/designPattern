package com.wlp.creational.builder;

/**
 * 具体产品，车
 */
public class Car {
    //发动机
    private String engine;
    //车轮
    private String wheel;
    //方向盘
    private String teeringWheel;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getTeeringWheel() {
        return teeringWheel;
    }

    public void setTeeringWheel(String teeringWheel) {
        this.teeringWheel = teeringWheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheel='" + wheel + '\'' +
                ", teeringWheel='" + teeringWheel + '\'' +
                '}';
    }
}

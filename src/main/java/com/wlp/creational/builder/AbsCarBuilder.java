package com.wlp.creational.builder;

/**
 * 抽象建造者
 */
public abstract class AbsCarBuilder {

    protected Car car = new Car() ;

    public abstract void buildEngine();
    public abstract void buildWheel();
    public abstract void buildTeeringWheel();

    public Car build(){
        return this.car ;
    }
}

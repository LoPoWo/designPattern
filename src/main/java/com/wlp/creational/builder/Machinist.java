package com.wlp.creational.builder;

/**
 *指挥者，机械师
 */
public class Machinist {
    private AbsCarBuilder absCarBuilder ;

    //传入对应的具体的建造者，建造对应的车
    public Machinist(AbsCarBuilder absCarBuilder){
        this.absCarBuilder = absCarBuilder ;
    }

    //建造车
    public Car buildCar(){
        this.absCarBuilder.buildEngine();
        this.absCarBuilder.buildWheel();
        this.absCarBuilder.buildTeeringWheel();
        return this.absCarBuilder.build() ;
    }
}

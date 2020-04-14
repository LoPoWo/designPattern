package com.wlp.structural.decorator;


/**
 * 抽象的装饰者
 *
 * 此类可为抽象，可为非抽象，根据实际情况而定
 *
 * 假设装饰者除了AbsCar中定义的方法外，还需定义一些其他方法，那么这个类可为抽象，让子类去实现
 *
 * public abstract class AbsDecorator extends AbsCar{
 */
public class AbsDecorator extends AbsCar{

    //将实际装饰操作委托给抽象的被装饰类
    private AbsCar absCar ;

    public AbsDecorator(AbsCar absCar) {
        this.absCar = absCar;
    }

    @Override
    protected String getDesc() {
        return this.absCar.getDesc();
    }

    @Override
    protected int getMoney() {
        return this.absCar.getMoney();
    }
}

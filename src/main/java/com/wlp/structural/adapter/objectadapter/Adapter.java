package com.wlp.structural.adapter.objectadapter;


/**
 * 适配器
 */
public class Adapter extends Adaptee implements ITarget {

    /**
     * 被适配者
     * 应采用spring依赖注入或其他方式，尽量不要让应用层传入参数，应当尽量遵守迪米特法则
     */
    //private Adaptee adaptee = new Adaptee();
    private Adaptee adaptee ;

    public Adapter() {
        this.adaptee = new Adaptee();
    }

    @Override
    public void requst() {
        System.out.println("适配器开始适配：电源插座电流==>电脑电源接口电流");
        this.adaptee.adapteeReuqest();
    }
}

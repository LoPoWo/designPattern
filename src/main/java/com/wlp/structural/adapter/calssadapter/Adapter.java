package com.wlp.structural.adapter.calssadapter;


/**
 * 适配器
 */
public class Adapter extends Adaptee implements ITarget  {
    @Override
    public void requst() {
        System.out.println("适配器开始适配：电源插座电流==>电脑电源接口电流");
        super.adapteeReuqest();
    }
}

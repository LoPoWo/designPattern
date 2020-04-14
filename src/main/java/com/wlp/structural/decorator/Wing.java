package com.wlp.structural.decorator;

public class Wing extends AbsDecorator {
    public Wing(AbsCar absCar) {
        super(absCar);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+" 翅膀";
    }

    @Override
    protected int getMoney() {
        return super.getMoney()+200000;
    }
}

package com.wlp.structural.decorator;

public class Ornament extends AbsDecorator {

    public Ornament(AbsCar absCar) {
        super(absCar);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() +" 小吊件";
    }

    @Override
    protected int getMoney() {
        return super.getMoney() + 14;
    }
}

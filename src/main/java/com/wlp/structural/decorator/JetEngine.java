package com.wlp.structural.decorator;


public class JetEngine extends AbsDecorator{
    public JetEngine(AbsCar absCar) {
        super(absCar);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+" 喷气式发动机";
    }

    @Override
    protected int getMoney() {
        return super.getMoney() +1300;
    }
}

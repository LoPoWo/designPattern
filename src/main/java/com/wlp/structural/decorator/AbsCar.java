package com.wlp.structural.decorator;

/**
 * 抽象的被装饰者
 */
public abstract  class AbsCar {

    //描述
    protected abstract String getDesc();

    //金额(实际项目，金额不能使用int哟)
    protected abstract int getMoney();
}

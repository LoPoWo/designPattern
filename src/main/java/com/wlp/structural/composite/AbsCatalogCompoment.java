package com.wlp.structural.composite;

/**
 * 目录组件
 *
 *
 * 此处选择抽象类的原因是：
 *
 *  课程和目录均继承自此类，而其中的方法之所以没使用抽象方法，是为了让子类自己选择去重写哪些方法
 *  因为有的方法在不同的子类中是不使用的
 */
public abstract class AbsCatalogCompoment {

    protected void add(AbsCatalogCompoment catalogCompoment){
        throw new UnsupportedOperationException("不支持添加操作");
    }
    protected void remove(AbsCatalogCompoment catalogCompoment){
        throw new UnsupportedOperationException("不支持删除操作");
    }

    protected String getName(){
        throw new UnsupportedOperationException("不支持获取名称");
    }
    protected double getPrice(){
        throw new UnsupportedOperationException("不支持获取价格");
    }
    protected void print(){
        throw new UnsupportedOperationException("不支持打印内容");
    }
}

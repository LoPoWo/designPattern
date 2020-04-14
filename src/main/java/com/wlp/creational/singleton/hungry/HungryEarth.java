package com.wlp.creational.singleton.hungry;

/**
 * 饿汉式
 */
public class HungryEarth {
    private static final  HungryEarth INSTANCE = new HungryEarth() ;
    private HungryEarth(){
        if(INSTANCE != null){
            throw new RuntimeException("单例模式禁止反射创建");
        }
    }
    public static HungryEarth getInstance(){
        return INSTANCE ;
    }
}

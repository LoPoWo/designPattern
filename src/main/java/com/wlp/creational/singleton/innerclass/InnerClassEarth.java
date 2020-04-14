package com.wlp.creational.singleton.innerclass;


/**
 * 内部类
 */
public class InnerClassEarth {

    private InnerClassEarth(){}
    public static class Inner{
        private static final InnerClassEarth INSTANCE = new InnerClassEarth() ;
    }
    public InnerClassEarth getInstance(){
        return Inner.INSTANCE;
    }

}

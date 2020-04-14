package com.wlp.creational.singleton.lazy;

import java.io.Serializable;

/**
 * 懒汉式
 */
public class LazyEarth implements Serializable {
    private LazyEarth(){
        //显然这里的判断是无法防止反射创建单例的，如果反射创建对象，那么instance依然为null，也就可以重复创建对象了
        //前提是getInstance方法的调用要优先于反射创建对象的调用，但这一点是无法干涉和保证的，因此懒加载类型单例模式无法防止反射破坏
//        if(instance != null){
//            throw new RuntimeException("单例模式禁止反射创建");
//        }
    }
    private static LazyEarth instance = null ;

    public static LazyEarth getInstance(){
        if (instance == null){
            instance = new LazyEarth() ;
        }
        return  instance;
    }

    //防止序列化
    private Object readResolve(){
        return instance;
    }
}

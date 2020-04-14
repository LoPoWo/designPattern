package com.wlp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象活动
 */
public abstract class Activity {

    //观察者集合
    List<IObserver> observers = new ArrayList<IObserver>();
    //添加观察者
    protected void addObserver(IObserver observer){
        observers.add(observer);
    }
    //删除观察者
    protected void removeObserver(IObserver observer){
        observers.remove(observer);
    }

    //通知观察者
    public abstract void notifyObserver();
}

package com.wlp.behavioral.observer;

/**
 * 游戏活动
 */
public class GameActivity extends Activity{

    public void notifyObserver() {
        for(IObserver observer : observers){
            observer.response();
        }
    }
}

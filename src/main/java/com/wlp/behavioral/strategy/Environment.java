package com.wlp.behavioral.strategy;

/**
 * 环境类
 */
public class Environment {

    protected ITripMode iTripMode ;

    public Environment(ITripMode iTripMode) {
        this.iTripMode = iTripMode;
    }

    public ITripMode getiTripMode() {
        return iTripMode;
    }

    public void setiTripMode(ITripMode iTripMode) {
        this.iTripMode = iTripMode;
    }

    protected void getOut(){
        iTripMode.getOut();
    }
}

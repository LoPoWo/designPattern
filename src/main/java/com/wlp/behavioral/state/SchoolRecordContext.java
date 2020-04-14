package com.wlp.behavioral.state;


/**
 * 环境
 * 学习成绩
 */
public class SchoolRecordContext{

    //状态
    private AbsSchoolRecordState state;

    public SchoolRecordContext() {
        //有一个初始状态
        this.state = new FailState(this);
    }

    public AbsSchoolRecordState getState() {
        return state;
    }

    public void setState(AbsSchoolRecordState state) {
        this.state = state;
    }

    public void addScore(int score){
        this.state.addScore(score);
    }
}

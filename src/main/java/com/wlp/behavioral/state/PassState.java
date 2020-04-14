package com.wlp.behavioral.state;

/**
 * 及格
 */
public class PassState extends AbsSchoolRecordState{
    public PassState(AbsSchoolRecordState state) {
        this.context = state.context ;
        this.name = "及格";
        this.score = state.score;
    }

    protected void checkScore() {
        if(this.score >= 90){
            this.context.setState(new ExcellenceState(this));
        }else if(this.score < 60){
            this.context.setState(new FailState(this));
        }
    }
}

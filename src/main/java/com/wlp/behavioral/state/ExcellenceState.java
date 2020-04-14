package com.wlp.behavioral.state;

/**
 * 优秀
 */
public class ExcellenceState extends AbsSchoolRecordState {

    public ExcellenceState(AbsSchoolRecordState state) {
        this.context = state.context;
        this.name = "优秀";
        this.score = state.score;
    }

    protected void checkScore() {
        if(this.score < 60){
            this.context.setState(new FailState(this));
        }else if(this.score < 90){
            this.context.setState(new PassState(this));
        }
    }
}

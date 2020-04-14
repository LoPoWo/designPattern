package com.wlp.behavioral.state;

/**
 * 不及格
 */
public class FailState extends AbsSchoolRecordState{

    /**
     * 环境初始化时，定义默认的状态时使用
     * @param context
     */
    public FailState(SchoolRecordContext context){
        this.context = context ;
        this.name = "不及格";
        this.score = 0 ;
    }

    /**
     * 根据分数检测改变状态时使用
     * @param state
     */
    public FailState(AbsSchoolRecordState state){
        this.context = state.context;
        this.name = "不及格";
        this.score = state.score;
    }


    protected void checkScore() {
       if(this.score >= 90){
            this.context.setState(new ExcellenceState(this));
       }else if(this.score >= 60){
           this.context.setState(new PassState(this));
       }

    }
}

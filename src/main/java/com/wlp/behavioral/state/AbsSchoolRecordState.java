package com.wlp.behavioral.state;

/**
 * 抽象学习成绩状态
 */
public abstract class AbsSchoolRecordState {

    //状态名称
    protected String name ;
    //学习成绩（环境）
    protected SchoolRecordContext context ;
    //分数
    protected int score ;

    //需要子类自己编写检测分数逻辑
    protected abstract void checkScore();

    //增加分数
    public final void addScore(int score){
        this.score += score;
        System.out.print("加上"+score+"分,当前分数："+this.score);

        //状态的改变就在这个检测方法,有子类确定逻辑
        checkScore();

        System.out.println("分，当前状态："+this.context.getState().name);
    }

}

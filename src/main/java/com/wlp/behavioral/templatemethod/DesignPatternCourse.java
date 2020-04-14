package com.wlp.behavioral.templatemethod;

public class DesignPatternCourse extends AbsCourse {
    void packageCourse() {
        System.out.println("提供Java课程源代码");
    }

    //如果要编写手记，则重写并返回true
    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}

package com.wlp.creational.abstractfactory;

/**
 * 具体的工厂
 */
public class JavaFactory extends AbsFactory {
    protected AbsCourse getCourse() {
        return new JavaCourse();
    }

    protected AbsArticle getArticle() {
        return new JavaArticle();
    }
}

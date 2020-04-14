package com.wlp.creational.abstractfactory;

public class PythonFactory extends AbsFactory {
    protected AbsCourse getCourse() {
        return new PythonCourse();
    }

    protected AbsArticle getArticle() {
        return new PythonArticle();
    }
}

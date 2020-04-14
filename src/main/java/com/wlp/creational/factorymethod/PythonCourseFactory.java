package com.wlp.creational.factorymethod;

public class PythonCourseFactory extends AbsCourseFactory {
    public AbsCourse getCourse() {
        return new PythonCourse();
    }
}

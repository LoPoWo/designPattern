package com.wlp.creational.factorymethod;

/**
 * 具体工厂角色
 */
public class JavaCourseFactory extends AbsCourseFactory {
    public AbsCourse getCourse() {
        return new JavaCourse();
    }
}

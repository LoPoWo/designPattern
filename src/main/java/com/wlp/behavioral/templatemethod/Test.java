package com.wlp.behavioral.templatemethod;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        System.out.println("后端设计课程start");
        AbsCourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计课程end");

        System.out.println();

        System.out.println("前端课程start");
        AbsCourse feCourse = new FECourse(false);
        feCourse.makeCourse();
        System.out.println("前端课程end");

        System.out.println();

        System.out.println("前端课程start");
        AbsCourse feCourse2 = new FECourse(true);
        feCourse2.makeCourse();
        System.out.println("前端课程end");

       /* try {
            Class<?> aClass = Class.forName("com.wlp.behavioral.templatemethod.AbsCourse");
            Method[] methods = aClass.getMethods();
            for(Method m : methods){
                System.out.println(m);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
    }
}

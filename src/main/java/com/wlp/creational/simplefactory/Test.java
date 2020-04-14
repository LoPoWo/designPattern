package com.wlp.creational.simplefactory;

/**
 * 简单工厂测试
 *
 * 模式结构：
 *  工厂角色、抽象产品、具体产品
 *
 *
 */
public class Test {
    public static void main(String[] args) {

        //v1

//        CourseFactory courseFactory = new CourseFactory();
//        AbsCourse java = courseFactory.getCourse("java");
//        java.studyCourse();
//        System.out.println("========");
//        AbsCourse python = courseFactory.getCourse("python");
//        python.studyCourse();


        //v2

        CourseFactory courseFactory = new CourseFactory() ;
        AbsCourse course = courseFactory.getCourse(JavaCourse.class);
        course.studyCourse();
        System.out.println("========");
        AbsCourse course1 = courseFactory.getCourse(PythonCourse.class);
        course1.studyCourse();


    }
}

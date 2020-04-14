package com.wlp.creational.simplefactory;

public class CourseFactory {

    //v1

//    /**
//     * 根据参数返回具体的产品
//     * @param courseName
//     * @return
//     */
//    public AbsCourse getCourse(String courseName){
//        if(courseName.equals("java")){
//            return new JavaCourse();
//        }else if(courseName.equals("python")){
//            return new PythonCourse();
//        }
//        return null ;
//    }

    //v2
    public AbsCourse getCourse(Class c){
        try {
            AbsCourse course = (AbsCourse)Class.forName(c.getName()).newInstance();
            return course ;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

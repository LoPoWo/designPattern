package com.wlp.behavioral.Iterator.innerclass;

import com.wlp.behavioral.Iterator.Course;
import com.wlp.behavioral.Iterator.IMyIterator;


/**
 * 迭代器模式
 */
public class Test {
    public static void main(String[] args) {
        MyAggregate<Course> courseMyAggregate = new MyAggregate<Course>();
        for(int i = 0 ; i < 10 ; i++){
            Course course = new Course("内部类方式：课程"+i,200+i);
            courseMyAggregate.add(course);
        }

        IMyIterator<Course> iterator = courseMyAggregate.createIterator();
        while (iterator.hasNext()){
            Course next = iterator.next();
            System.out.println(next);
        }

    }
}

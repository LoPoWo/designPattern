package com.wlp.behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器模式
 *
 *
 * 抽象聚合（Aggregate）角色：定义存储、添加、删除聚合对象以及创建迭代器对象的接口。
 * 具体聚合（ConcreteAggregate）角色：实现抽象聚合类，返回一个具体迭代器的实例。
 * 抽象迭代器（Iterator）角色：定义访问和遍历聚合元素的接口，通常包含 hasNext()、first()、next() 等方法。
 * 具体迭代器（Concretelterator）角色：实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置。
 */
public class Test {
    public static void main(String[] args) {
        MyAggregate<Course> courseMyAggregate = new MyAggregate<Course>();
        for(int i = 0 ; i < 10 ; i++){
            Course course = new Course("课程"+i,100+i);
            courseMyAggregate.add(course);
        }

        courseMyAggregate.remove(1);
        IMyIterator<Course> iterator = courseMyAggregate.createIterator();
        while (iterator.hasNext()){
            Course next = iterator.next();
            System.out.println(next);
        }

        List<String> a = new ArrayList<String>();
        a.add("");

    }
}

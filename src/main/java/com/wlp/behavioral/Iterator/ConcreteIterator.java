package com.wlp.behavioral.Iterator;

/**
 * 具体的迭代器
 */
public class ConcreteIterator<T> implements IMyIterator<Course>{
    //需要迭代的容器
    private MyAggregate<Course> myAggregate ;

    public ConcreteIterator(MyAggregate myAggregate) {
        this.myAggregate = myAggregate;
    }

    //游标
    private int cursor = -1;

    public boolean hasNext() {
        if((cursor + 1) < myAggregate.size()){
            cursor++;
            return true ;
        }
        return false;
    }

    public Course next() {
        Course Course = this.myAggregate.get(cursor);
        return Course;
    }
}

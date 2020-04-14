package com.wlp.behavioral.Iterator;

/**
 * 抽象迭代器
 * @param <T>
 */
public interface IMyIterator<T> {

    boolean hasNext();

    T next();
}

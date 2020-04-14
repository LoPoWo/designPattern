package com.wlp.behavioral.Iterator;

/**
 * 抽象聚合
 */
public interface  IAggregate {
    IMyIterator createIterator();
}

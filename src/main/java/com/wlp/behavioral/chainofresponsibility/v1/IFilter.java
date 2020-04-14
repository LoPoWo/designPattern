package com.wlp.behavioral.chainofresponsibility.v1;

/**
 * 过滤器
 */
public interface IFilter<T> {
    //返回true时继续往下执行，反之不执行后面的过滤器链了
    boolean doFilter(T t);
}

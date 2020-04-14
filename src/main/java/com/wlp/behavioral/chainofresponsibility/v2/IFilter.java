package com.wlp.behavioral.chainofresponsibility.v2;

/**
 * 过滤器接口
 */
public interface IFilter {
    boolean doFilter(Request request ,Response response,FilterChain chain);
}

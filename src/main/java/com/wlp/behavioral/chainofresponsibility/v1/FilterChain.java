package com.wlp.behavioral.chainofresponsibility.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器链
 */
public class FilterChain implements IFilter<Msg>{

    List<IFilter> fileterList = new ArrayList<IFilter>();

    public FilterChain add(IFilter filter){
        fileterList.add(filter);
        return this ;
    }

    public boolean doFilter(Msg msg) {
        for (IFilter fileter : fileterList){
            //其中有一环返回false，则不往后执行了
           if(!fileter.doFilter(msg)){
               return false ;
            }
        }
        return true;
    }
}

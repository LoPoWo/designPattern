package com.wlp.behavioral.chainofresponsibility.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器链
 */
public class FilterChain implements IFilter{

    private List<IFilter> filters = new ArrayList<IFilter>();
    private int cursor ;

    public boolean doFilter(Request request, Response response, FilterChain chain) {
        if(cursor == filters.size()) return false ;

        IFilter filter = filters.get(cursor);
        cursor++;
        return filter.doFilter(request,response,chain);
    }

    public FilterChain add(IFilter filter){
        filters.add(filter);
        return  this;
    }
}

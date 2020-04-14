package com.wlp.behavioral.chainofresponsibility.v1;

/**
 * html 过滤器
 */
public class HtmlFilter implements IFilter<Msg> {

    public boolean doFilter(Msg msg) {
        String newMsg = msg.getContent().replace("<","").replace(">","");
        msg.setContent(newMsg);
        return true ;
    }
}

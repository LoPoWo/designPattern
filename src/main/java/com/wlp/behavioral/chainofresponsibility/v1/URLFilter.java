package com.wlp.behavioral.chainofresponsibility.v1;

public class URLFilter implements IFilter<Msg> {
    public boolean doFilter(Msg msg) {
        String newMsg = msg.getContent().replace("baidu.com", "http://www.baidu.com");
        msg.setContent(newMsg);
        return true;
    }
}

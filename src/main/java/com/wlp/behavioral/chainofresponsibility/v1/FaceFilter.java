package com.wlp.behavioral.chainofresponsibility.v1;

/**
 * 表情过滤器
 */
public class FaceFilter implements IFilter<Msg> {
    public boolean doFilter(Msg msg) {
        String newMsg = msg.getContent().replace(":)", "^_^");
        msg.setContent(newMsg);

        return true ;
    }
}

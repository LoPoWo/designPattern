package com.wlp.behavioral.chainofresponsibility.v2;

/**
 * 敏感词过滤器
 */
public class SensitiveFilter implements IFilter {
    public boolean doFilter(Request request, Response response, FilterChain chain) {
        String newMsg = request.getContent().replace("猪头", "猪八戒");
        request.setContent(newMsg);

        chain.doFilter(request,response,chain);

        response.setContent(response.getContent()+"SensitiveFilter,");
        return true;
    }
}

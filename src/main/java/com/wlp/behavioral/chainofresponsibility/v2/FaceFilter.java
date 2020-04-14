package com.wlp.behavioral.chainofresponsibility.v2;

/**
 * 表情过滤器
 */
public class FaceFilter implements IFilter {
    public boolean doFilter(Request request, Response response, FilterChain chain) {
        String newMsg = request.getContent().replace(":)", "^_^");
        request.setContent(newMsg);

        chain.doFilter(request,response,chain);

        response.setContent(response.getContent()+"FaceFilter,");

        return true;
    }
}

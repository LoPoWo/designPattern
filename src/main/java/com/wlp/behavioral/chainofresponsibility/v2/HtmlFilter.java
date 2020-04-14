package com.wlp.behavioral.chainofresponsibility.v2;

/**
 * html 过滤器
 */
public class HtmlFilter implements IFilter {
    public boolean doFilter(Request request, Response response, FilterChain chain) {
        String newMsg = request.getContent().replace("<", "[").replace(">", "]");
        request.setContent(newMsg);

        chain.doFilter(request,response,chain);
        response.setContent(response.getContent()+"HtmlFilter,");
        return true;
    }
}

package com.wlp.behavioral.chainofresponsibility.v1;

public class Test {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setContent("<script>:) 你好啊</script> baidu.com" );
        FilterChain chain = new FilterChain();
        chain.add(new HtmlFilter()).add(new FaceFilter());

        FilterChain chain2 = new FilterChain();
        chain2.add(new URLFilter());

        chain.add(chain2);

        chain.doFilter(msg);

        System.out.println(msg.getContent());
    }
}

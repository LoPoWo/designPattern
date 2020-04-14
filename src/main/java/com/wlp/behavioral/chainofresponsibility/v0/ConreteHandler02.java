package com.wlp.behavioral.chainofresponsibility.v0;

public class ConreteHandler02 extends AbsHandler {
    protected void handle(String msg) {
        if("02".equals(msg)){
            System.out.println("ConreteHandler02 处理请求");
        }else {
            if(getNext() != null){
                getNext().handle(msg);
            }else{
                System.out.println("无人处理");
            }
        }
    }
}

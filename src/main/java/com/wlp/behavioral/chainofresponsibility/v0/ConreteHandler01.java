package com.wlp.behavioral.chainofresponsibility.v0;

/**
 * 具体处理者1
 */
public class ConreteHandler01 extends AbsHandler {

    protected void handle(String msg) {
        if("01".equals(msg)){
            System.out.println("ConreteHandler01 处理请求");
        }else {
            if(getNext() != null){
                getNext().handle(msg);
            }else{
                System.out.println("无人处理请求");
            }

        }
    }
}

package com.wlp.behavioral.chainofresponsibility.v0;

/**
 * 责任链，网上简单版
 */
public class Test {
    public static void main(String[] args) {
        AbsHandler conreteHandler01 = new ConreteHandler01();
        AbsHandler conreteHandler02 = new ConreteHandler02();

        conreteHandler01.setNext(conreteHandler02);

        conreteHandler01.handle("01");

        System.out.println("=============");
        conreteHandler01.handle("02");

        System.out.println("=============");
        conreteHandler01.handle("03");
    }
}

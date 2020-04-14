package com.wlp.behavioral.memento;


import java.util.Stack;

/**
 * 管理者角色
 *
 * 美女栈
 */
public class GirlStack {
    /**
     * 如果只保存一个，则不需要容器
     */
    Stack<Girl> girls = new Stack<Girl>();
    private static final int SIZE = 5 ;

    public void push(Girl girl){
        if(girls.size() < SIZE){
            girls.push(girl);
        }
    }

    public Girl pop(){
        if(girls.size() == 1){
            return girls.peek();
        }
        return girls.pop();
    }
}

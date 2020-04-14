package com.wlp.behavioral.memento;

public class Test {
    public static void main(String[] args) {
        GirlStack girlStack = new GirlStack();
        Me me = new Me();
        me.setWifeName("小师妹");
        girlStack.push(me.createMemento());
        me.setWifeName("杨玉环");
        girlStack.push(me.createMemento());
        me.setWifeName("貂蝉");
        girlStack.push(me.createMemento());
        me.setWifeName("西施");
        girlStack.push(me.createMemento());

        System.out.println(me.getWifeName());

        System.out.println("======");
        for(int i = 0 ; i < 4 ; i++){
            me.restoreMemento(girlStack.pop());
            System.out.println(me.getWifeName());
        }
    }
}

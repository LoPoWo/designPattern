package com.wlp.creational.prototype;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeObject prototypeObject = new PrototypeObject(new Date(),"原型",new Person("张三",1,88)) ;
        PrototypeObject clone =(PrototypeObject) prototypeObject.clone();

        System.out.println(clone.getPerson());
        System.out.println(prototypeObject.getPerson());
        System.out.println(clone.getPerson() == prototypeObject.getPerson());

        clone.getPerson().setName("李四");
        clone.getPerson().setAge(100);
        clone.getPerson().setHeight(900);
        clone.getDate().setTime(553333333333355L);
        //clone.setPerson(null);//只是将引用变为null，而没有将内存中的person设置为null
        //测试时，如果是改的引用，那么将显示不出效果，必须修改到共享的对象才行


        System.out.println(clone.getPerson());
        System.out.println(prototypeObject.getPerson());
        System.out.println(clone.getPerson() == prototypeObject.getPerson());

        System.out.println(clone);
        System.out.println(prototypeObject);

        /**
         *
         */


    }
}

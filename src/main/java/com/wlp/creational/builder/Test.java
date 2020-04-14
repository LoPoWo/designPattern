package com.wlp.creational.builder;

/**
 * 建造者模式
 *
 * 建造者（Builder）模式的主要角色如下。
 * 产品角色（Product）：它是包含多个组成部件的复杂对象，由具体建造者来创建其各个滅部件。
 * 抽象建造者（Builder）：它是一个包含创建产品各个子部件的抽象方法的接口，通常还包含一个返回复杂产品的方法 getResult()。
 * 具体建造者(Concrete Builder）：实现 Builder 接口，完成复杂产品的各个部件的具体创建方法。
 * 指挥者（Director）：它调用建造者对象中的部件构造与装配方法完成复杂对象的创建，在指挥者中不涉及具体产品的信息。
 *
 * 建造者（Builder）模式和工厂模式的关注点不同：建造者模式注重零部件的组装过程，
 * 而工厂方法模式更注重零部件的创建过程，但两者可以结合使用。
 *
 * 优点：
 * 各个具体的建造者相互独立，有利于系统的扩展。
 * 客户端不必知道产品内部组成的细节，便于控制细节风险。
 *
 * 缺点：
 * 产品的组成部分必须相同，这限制了其使用范围。
 * 如果产品的内部变化复杂，该模式会增加很多的建造者类。
 *

 *
 */
public class Test {
    public static void main(String[] args) {
        FerrariBuilder ferrariBuilder = new FerrariBuilder() ;
        Machinist machinist = new Machinist(ferrariBuilder);
        Car car = machinist.buildCar();
        System.out.println(car);

        System.out.println("==============");

        BmwBuilder bmwBuilder = new BmwBuilder();
        Machinist machinist1 = new Machinist(bmwBuilder);
        Car car1 = machinist1.buildCar();
        System.out.println(car1);
    }
}

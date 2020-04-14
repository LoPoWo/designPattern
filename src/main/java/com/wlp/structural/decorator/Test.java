package com.wlp.structural.decorator;

/**
 * 装饰着模式
 *
 * 优点：
 * 采用装饰模式扩展对象的功能比采用继承方式更加灵活。
 * 可以设计出多个不同的具体装饰类，创造出多个不同行为的组合。
 *
 *  缺点：
 * 装饰模式增加了许多子类，如果过度使用会使程序变得很复杂。
 *
 *
 *
 * 抽象构件（Component）角色：定义一个抽象接口以规范准备接收附加责任的对象。
 * 具体构件（Concrete    Component）角色：实现抽象构件，通过装饰角色为其添加一些职责。
 * 抽象装饰（Decorator）角色：继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
 * 具体装饰（ConcreteDecorator）角色：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。
 */
public class Test {
    public static void main(String[] args) {
        AbsCar absCar ;
        absCar = new BmwCar();
        absCar = new Wing(absCar);
        absCar = new JetEngine(absCar);
        absCar = new Ornament(absCar);

        System.out.println("套装： "+absCar.getDesc());
        System.out.println("金额： "+absCar.getMoney());
    }
}

package com.wlp.structural.flyweight;

/**
 * 抽象享元角色（Flyweight）:
 *      是所有的具体享元类的基类，为具体享元规范需要实现的公共接口，非享元的外部状态以参数的形式通过方法传入。
 * 具体享元（Concrete Flyweight）角色：
 *      实现抽象享元角色中所规定的接口。
 * 非享元（Unsharable Flyweight)角色：
 *      是不可以共享的外部状态，它以参数的形式注入具体享元的相关方法中。
 * 享元工厂（Flyweight Factory）角色：
 *      负责创建和管理享元角色。当客户对象请求一个享元对象时，享元工厂检査系统中是否存在符合要求的享元对象，如果存在则提供给客户；如果不存在的话，则创建一个新的享元对象。
 */
public class Test {

    public static final String [] departments = {"开发部","行政部","财务部"};

    public static void main(String[] args) {
        for(int i = 0 ; i<10 ; i ++ ){
            Employee manager = EmployeeFactory.getManager(departments[(int) (Math.random() * departments.length)]);
            manager.report();
        }
    }
}

package com.wlp.structural.bridge;

/**
 * 桥接模式
 *
 * 桥接（Bridge）模式的优点是：
 * 由于抽象与实现分离，所以扩展能力强；
 * 其实现细节对客户透明。
 *
 * 缺点是：由于聚合关系建立在抽象层，要求开发者针对抽象化进行设计与编程，这增加了系统的理解与设计难度。
 *
 * *桥接（Bridge）模式包含以下主要角色。
 * 抽象化（Abstraction）角色：定义抽象类，并包含一个对实现化对象的引用。
 * 扩展抽象化（Refined    Abstraction）角色：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
 * 实现化（Implementor）角色：定义实现化角色的接口，供扩展抽象化角色调用。
 * 具体实现化（Concrete Implementor）角色：给出实现化角色接口的具体实现。
 *
 * 将实现与抽象分离，独立可扩展
 *
 * 当一个产品有2个或者多个维度的变化，就可以使用此模式，例如：
 *      女士皮包有很多种，可以按用途分、按皮质分、按品牌分、按颜色分、按大小分等，存在多个维度的变化，所以采用桥接模式来实现女士皮包的选购比较合适。
 */
public class Test {
    public static void main(String[] args) {
        AbsBank abcBank1 = new AbcBank(new CurrentAccount());
        abcBank1.openBankAccount();
        AbsBank abcBank2 = new AbcBank(new DepositAccount());
        abcBank2.openBankAccount();

        AbsBank icbcBank1 = new IcbcBank(new CurrentAccount());
        icbcBank1.openBankAccount();
        AbsBank icbcBank2 = new IcbcBank(new DepositAccount());
        icbcBank2.openBankAccount();
    }
}

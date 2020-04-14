package com.wlp.behavioral.visitor;

import java.util.Random;

/**
 * 经理
 */
public class Manager extends AbsStaff {
    private int products;

    public Manager(String name) {
        super(name);
        products = new Random().nextInt(10);
    }

    protected void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    // 一年做的产品数量
    public int getProducts() {
        return products;
    }
}

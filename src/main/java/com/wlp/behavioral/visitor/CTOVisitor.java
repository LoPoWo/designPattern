package com.wlp.behavioral.visitor;

/**
 * CTO 访问者
 */
public class CTOVisitor implements IVisitor{

    public void visit(Engineer engineer) {
        System.out.println("工程师"+engineer.name+"\t,代码行数："+engineer.getCodeLines());
    }

    public void visit(Manager manager) {
        System.out.println("经理"+manager.name+"\t,产品数量："+manager.getProducts());
    }
}

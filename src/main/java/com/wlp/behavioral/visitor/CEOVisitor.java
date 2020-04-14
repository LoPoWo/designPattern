package com.wlp.behavioral.visitor;

/**
 * CEO访问类
 */
public class CEOVisitor implements IVisitor {
    public void visit(Engineer engineer) {
        System.out.println("工程师"+engineer.name+"\t,kpi："+engineer.kpi);
    }

    public void visit(Manager manager) {
        System.out.println("经理"+manager.name+"\t,kpi:"+manager.kpi+",产品数量："+manager.getProducts());
    }
}

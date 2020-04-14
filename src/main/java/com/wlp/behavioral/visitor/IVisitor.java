package com.wlp.behavioral.visitor;

/**
 * 抽象访问者
 */
public interface IVisitor {

    void visit(Engineer engineer);
    void visit(Manager manager);
}

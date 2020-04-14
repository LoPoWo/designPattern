package com.wlp.behavioral.visitor;

import java.util.Random;

/**
 * 工程师
 */
public class Engineer extends AbsStaff {
    private int codeLines ;
    public Engineer(String name) {
        super(name);
        codeLines = new Random().nextInt(10 * 10000);
    }

    protected void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    // 工程师一年的代码数量
    public int getCodeLines() {
        return codeLines;
    }
}

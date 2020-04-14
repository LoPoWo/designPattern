package com.wlp.behavioral.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 对象结构角色
 *
 * 员工业务报表类
 */
public class BusinessReport {
    private List<AbsStaff> mStaffs = new ArrayList<AbsStaff>();

    public void add( AbsStaff staff){
        mStaffs.add(staff);
    }

    public void remove(AbsStaff staff){
        mStaffs.remove(staff);
    }

    public void accept(IVisitor visitor){
        Iterator<AbsStaff> iterator = mStaffs.iterator();
        while (iterator.hasNext()){
            AbsStaff next = iterator.next();
            next.accept(visitor);
        }
    }
}

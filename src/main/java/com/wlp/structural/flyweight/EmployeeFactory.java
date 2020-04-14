package com.wlp.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 */
public class EmployeeFactory {
    private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap<String,Employee>();

    public static Employee getManager(String department){
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if(manager == null){
            manager = new Manager(department);
            System.out.println("创建部门经理："+department);
            manager.setReportContent("本次汇报内容，巴拉巴拉...");
            EMPLOYEE_MAP.put(department,manager);
        }
        return manager ;
    }
}

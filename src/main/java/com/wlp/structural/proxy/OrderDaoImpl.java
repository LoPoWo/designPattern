package com.wlp.structural.proxy;

public class OrderDaoImpl implements IOrderDao {
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 0;
    }
}

package com.wlp.structural.proxy.staticproxy;

import com.wlp.structural.proxy.IOrderService;
import com.wlp.structural.proxy.Order;
import com.wlp.structural.proxy.OrderServiceImpl;
import com.wlp.structural.proxy.db.DataSourceContextHolder;

public class OrderServiceStaticProxy {
    private IOrderService iOrderService ;

    public int saveOrder(Order order){
        //前置通知，增强
        beforeMethod(order);

        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);

        //后置通知，增强
        afterMethod();
        return  result ;
    }

    private void beforeMethod(Order order){
        int userId = order.getUserId();
        int dbRouter = userId %2 ;
        System.out.println("静态代理分配到【db:"+dbRouter+"】数据库处理数据");
        StringBuilder stringBuilder = new StringBuilder("db");
        stringBuilder.append(dbRouter);
        DataSourceContextHolder.setDBType(stringBuilder.toString());
        System.out.println("静态代理 befor code");
    }
    private void afterMethod(){
        System.out.println("静态代理 after code");
    }
}

package com.wlp.structural.proxy.dynamicproxy;

import com.wlp.structural.proxy.IOrderService;
import com.wlp.structural.proxy.Order;
import com.wlp.structural.proxy.OrderServiceImpl;

/**
 * 动态代理
 *
 * 和以往的代理模式其实是一样的，只是加入了一些应用场景，所以看起来会比普通的代理模式复杂
 *
 * 此场景是根据order的userId判断进入哪个数据库进行处理
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);
//        order.setUserId(2);

        IOrderService iOrderService = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        iOrderService.saveOrder(order);
    }
}

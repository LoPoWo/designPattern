package com.wlp.structural.proxy;

public class OrderServiceImpl implements  IOrderService {

    private IOrderDao iOrderDao ;

    public int saveOrder(Order order) {
        //spring会自己注入，这里就这么写了
        iOrderDao = new OrderDaoImpl() ;
        System.out.println("Service层调用Dao层添加方法");
        return iOrderDao.insert(order);
    }
}

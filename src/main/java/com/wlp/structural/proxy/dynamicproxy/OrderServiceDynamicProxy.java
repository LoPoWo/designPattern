package com.wlp.structural.proxy.dynamicproxy;

import com.wlp.structural.proxy.Order;
import com.wlp.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target ;


    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy
     * @param method 要被增强的方法对象
     * @param args 传入方法的参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //拿到传入的order对象
        Object argObject = args[0];
        //前置
        beforMethod(argObject);
        //反射调用具体方法
        Object result = method.invoke(target, args);
        //后置
        afterMethod();
        return result;
    }

    public Object bind(){
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }

    private void beforMethod(Object obj){

        int userId = 0 ;
        System.out.println("动态代理 befor code");
        if(obj instanceof Order){
            Order order = (Order) obj;
            userId = order.getUserId();
        }
        int dbRouter = userId %2 ;
        System.out.println("动态代理分配到【db:"+dbRouter+"】数据库处理数据");
        StringBuilder stringBuilder = new StringBuilder("db");
        stringBuilder.append(dbRouter);
        DataSourceContextHolder.setDBType(stringBuilder.toString());
    }

    private void afterMethod(){
        System.out.println("动态代理 after code");
    }
}


package com.wlp.creational.singleton.doublecheck;

/**
 * 地球
 */
public class Earth {

    //volatile 此场景中是为了防止指令重排序
    private static volatile  Earth _instance = null ;

    private Earth(){}


    public static Earth getInstance(){
        /*
           线程0可能因为指令重排序的原因，执行了第2步，此时_instance不为null，但是是一个半初始化状态
           后续来的线程1判断到_instance不为null，直接返回了，拿到一个半初始化的对象进行了访问，明显是不对的
           所以加上volatile关键字，防止指令重排序
         */
        if(_instance == null){
            synchronized (Earth.class){
                if(_instance == null){
                    /*
                        因为new 分为三步
                        1.分配内存空间
                        2.初始化对象
                        3.将对象指向刚分配的内存空间

                        重排序后可能会
                        1.分配内存空间
                        2.将对象指向刚分配的内存空间（将_instance的引用地址指向分配的内存地址）
                        3.初始化对象
                        初始化对象，调用父类构造器，成员变量赋初始值
                     */
                    _instance = new Earth();
                }
            }
        }
        return _instance;
    }
}

package com.wlp.creational.singleton;


import com.wlp.creational.singleton.doublecheck.TestRunable;
import com.wlp.creational.singleton.enumsigleton.EnumEarth;
import com.wlp.creational.singleton.hungry.HungryEarth;
import com.wlp.creational.singleton.lazy.LazyEarth;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式
 */
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        new Thread(new TestRunable()).start();
//        new Thread(new TestRunable()).start();


        /**
         *可通过序列化和反序列打破单例
         *
         *
         * 解决方案：
         * 通过为序列化类添加方法，可阻止
         * //防止序列化
         *     private Object readResolve(){
         *         return instance;
         *     }
         *
         *    为什么会是这个方法名呢?
         *      具体查看对象输入轮流ObjectInputStream的readObject()方法内部，在readObject()方法内，回去判断序列化类是否有readResolve方法
         *      如果序列化类有这么一个方法，那么不会使用自己内部反射创建的对象，而是使用readResolve返回的对象(反射执行readResolve方法，得到其返回值)
         */
        /*ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("instance_file"));
        LazyEarth instance = LazyEarth.getInstance();
        objectOutputStream.writeObject(instance);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("instance_file"));
        LazyEarth newInstance = (LazyEarth)objectInputStream.readObject();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(newInstance == instance);*/


        /**
         * 反射打破单例
         */
        /*LazyEarth instance = LazyEarth.getInstance();
        Constructor<LazyEarth> declaredConstructor = LazyEarth.class.getDeclaredConstructor();
        //将私有构造器权限修改为可访问
        declaredConstructor.setAccessible(true);
        LazyEarth newInstance = declaredConstructor.newInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(newInstance == instance);*/

        /**
         * 非懒加载类型的单例模式，应对反射破解
         *
         * 在私有构造器中通过判断instance是否为null，如不为null，则代表已经创建对象，抛出异常
         *
         *
         * 非懒加载：在类加载时就给instance赋值了
         * 懒加载：类加载时就不给instance赋值，需要手动调用方法后，才能触发instance的初始化
         */

        /*HungryEarth instance = HungryEarth.getInstance();
        Constructor<HungryEarth> declaredConstructor = HungryEarth.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        HungryEarth newInstance = declaredConstructor.newInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(newInstance == instance);*/

        /**
         * 懒加载类型的单例模式，无法使用上述解决方案解决反射破坏单例：LazyEarth 举例
         *
         * 显然在私有构造器中通过判断，或者其他标志等条件来判断是无法防止反射创建单例的，如果反射创建对象，那么instance依然为null，也就可以重复创建对象了
         * 前提是getInstance方法的调用要优先于反射创建对象的调用，但这一点是无法干涉和保证的，因此懒加载类型单例模式无法防止反射破坏
         */


        /**
         * 终极单例，枚举单例，特性天生防止序列化破坏单例及反射破坏单例
         *
         * readObject方法中获取枚举类对象的名称，名称是唯一的，并且对应一个常量对象，所以序列化无法破坏单例
         */

        /*ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("instance_file"));
        EnumEarth instance = EnumEarth.getInstance();
        instance.setData(new Object());
        objectOutputStream.writeObject(instance);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("instance_file"));
        EnumEarth newInstance = (EnumEarth)objectInputStream.readObject();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(newInstance == instance);
        System.out.println("=========");
        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(newInstance.getData() == instance.getData());*/

        /**
         反射创建枚举对象，将会造成以下错误:
         Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects
         at java.lang.reflect.Constructor.newInstance(Constructor.java:417)
         at com.wlp.creational.singleton.Test.main(Test.java:109)

         newInstance方法中明确判断到：
         if ((clazz.getModifiers() & Modifier.ENUM) != 0)
         throw new IllegalArgumentException("Cannot reflectively create enum objects");

         */
        EnumEarth instance = EnumEarth.getInstance();
        Constructor<EnumEarth> declaredConstructor = EnumEarth.class.getDeclaredConstructor(String.class,int.class);
        declaredConstructor.setAccessible(true);
        EnumEarth newInstance = declaredConstructor.newInstance("www",888);
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);



    }
}

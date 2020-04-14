package com.wlp.structural.composite;

/**
 * 组合模式
 * 组合模式的主要优点有：
 * 组合模式使得客户端代码可以一致地处理单个对象和组合对象，无须关心自己处理的是单个对象，还是组合对象，这简化了客户端代码；
 * 更容易在组合体内加入新的对象，客户端不会因为加入了新的对象而更改源代码，满足“开闭原则”；
 *
 * 其主要缺点是：
 * 设计较复杂，客户端需要花更多时间理清类之间的层次关系；
 * 不容易限制容器中的构件；
 * 不容易用继承的方法来增加构件的新功能；
 *
 *  树形结构
 *
 * 抽象构件（Component）角色：它的主要作用是为树叶构件和树枝构件声明公共接口，并实现它们的默认行为。在透明式的组合模式中抽象构件还声明访问和管理子类的接口；在安全式的组合模式中不声明访问和管理子类的接口，管理工作由树枝构件完成。
 * 树叶构件（Leaf）角色：是组合中的叶节点对象，它没有子节点，用于实现抽象构件角色中 声明的公共接口。
 * 树枝构件（Composite）角色：是组合中的分支节点对象，它有子节点。它实现了抽象构件角色中声明的接口，它的主要作用是存储和管理子部件，通常包含 Add()、Remove()、GetChild() 等方法。
 */
public class Test {
    public static void main(String[] args) {
        AbsCatalogCompoment absCatalogCompoment0 = new Catalog("主目录",1);

        AbsCatalogCompoment absCatalogCompoment1 = new Catalog("Java课程",2);

        AbsCatalogCompoment course1 = new Course("网络编程",88d);
        AbsCatalogCompoment course2 = new Course("高并发编程",88d);
        AbsCatalogCompoment course3 = new Course("Java SE",88d);
        absCatalogCompoment1.add(course1);
        absCatalogCompoment1.add(course2);
        absCatalogCompoment1.add(course3);

        AbsCatalogCompoment absCatalogCompoment2 = new Catalog("Python课程",2);

        AbsCatalogCompoment course11 = new Course("人工智能算法",88d);
        AbsCatalogCompoment course22 = new Course("语法基础",88d);
        absCatalogCompoment2.add(course11);
        absCatalogCompoment2.add(course22);

        absCatalogCompoment0.add(absCatalogCompoment1);
        absCatalogCompoment0.add(absCatalogCompoment2);

        absCatalogCompoment0.print();


    }
}


package com.wlp.structural.composite;

/**
 * 课程
 */
public class Course extends AbsCatalogCompoment{
    private String name ;
    private Double price ;


    public Course(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    protected String getName() {
        return this.name ;
    }

    @Override
    protected double getPrice() {
        return this.price;
    }

    @Override
    protected void print() {
        System.out.println("课程名称："+this.name+", 课程价格："+this.price);
    }
}

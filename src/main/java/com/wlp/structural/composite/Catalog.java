package com.wlp.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 目录
 */
public class Catalog extends AbsCatalogCompoment {
    //目录名称
    private String name ;
    //目录等级,用做打印缩进，显示出级联效果
    private Integer level ;
    //包含的课程
    private List<AbsCatalogCompoment> courses ;

    public Catalog(String name, Integer level) {
        courses = new ArrayList<AbsCatalogCompoment>();
        this.name = name;
        this.level = level;
    }

    @Override
    protected String getName() {
        return this.name ;
    }

    @Override
    protected void add(AbsCatalogCompoment catalogCompoment) {
        this.courses.add(catalogCompoment);
    }

    @Override
    protected void remove(AbsCatalogCompoment catalogCompoment) {
        this.courses.remove(catalogCompoment);
    }

    @Override
    protected void print() {
        System.out.println("课程目录名称："+this.name);
        for (AbsCatalogCompoment absCatalogCompoment : courses){
            for(int i = 0 ; i < this.level ; i++){
                System.out.print(" ");
            }
            absCatalogCompoment.print();
        }
        System.out.println();
    }
}

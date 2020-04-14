package com.wlp.behavioral.templatemethod;

/**
 * 前端课程
 */
public class FECourse extends AbsCourse {
    private boolean needWriteArticleFlag = false ;
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程图片等多媒体文件");
    }


    /**
     * 当我们有的课程需要手记，而有的又不需要手记时，可采用这样的方式暴露给应用层传入值，
     * 根据其值判断是否需要写手记，这样就灵活多了
     *
     * 可以使用set方法，这里就是用构造器方式了
     * @param needWriteArticleFlag
     */
    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
/*
    此类定义的是前端课程类，前端可能包含很多课程：css，js，vue，bootstrap等等

    如果按照这样的写法，所有的课程都会有手记。

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
*/
}

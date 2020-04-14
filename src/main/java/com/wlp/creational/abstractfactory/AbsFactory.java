package com.wlp.creational.abstractfactory;

/**
 * 抽象工厂
 */
public abstract class AbsFactory {
    protected abstract AbsCourse getCourse();
    protected abstract AbsArticle getArticle();
}

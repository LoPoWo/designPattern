package com.wlp.creational.prototype;

import java.util.Date;

/**
 * 原型模式
 */
public class PrototypeObject implements Cloneable {

    private Date date ;
    private String msg ;
    private Person person ;

    public PrototypeObject() {
    }

    public PrototypeObject(Date date, String msg,Person person) {
        this.date = date;
        this.msg = msg;
        this.person = person ;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //测试写法
        if(false){
            //浅克隆，是不复制引用类型的
            return super.clone();
        }else{
            //深克隆，需要手动将需要克隆的属性进行克隆，并且该属性还要实现克隆接口才行
            //注意这其中的坑,并且必须将可实现Cloneable接口的属性一并克隆并赋值，否则将埋下巨大的坑
            PrototypeObject clone = (PrototypeObject)super.clone();
            clone.person = (Person) clone.person.clone();
            clone.date = (Date) clone.date.clone();
            return clone ;

            //序列化实现深拷贝，内部采用反射创建对象，效率比直接clone要低
        }

    }

    @Override
    public String toString() {
        return "PrototypeObject{" +
                "date=" + date +
                ", msg='" + msg + '\'' +
                ", person=" + person +
                '}';
    }
}

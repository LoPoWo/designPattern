package com.wlp.structural.facade;

/**
 * 礼物
 */
public class Gift {
    private String name ;
    private int integral ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public Gift(String name, int integral) {
        this.name = name;
        this.integral = integral;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                ", integral=" + integral +
                '}';
    }
}

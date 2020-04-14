package com.wlp.structural.adapter;

public class Test {
    public static void main(String[] args) {
        IComputerPowerTarget iComputerPowerTarget = new Power20VAdapter();
        iComputerPowerTarget.charge();
    }
}

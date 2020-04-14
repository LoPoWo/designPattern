package com.wlp.creational.singleton.enumsigleton;



public enum EnumEarth {
    INSTANCE;

    private Object data ;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumEarth getInstance(){
        return INSTANCE ;
    }
}

package com.wlp.structural.facade;

/**
 * 发货服务
 */
public class ShipmentsService {

    public boolean shipments(Gift gift){
        System.out.println(gift+"：发货成功");
        return true ;
    }
}

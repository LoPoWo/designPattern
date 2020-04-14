package com.wlp.structural.facade;

/**
 * 支付验证
 */
public class PayValidateService {
    /**
     * 支付验证
     * @param gift
     * @return
     */
    public boolean validate(Gift gift){
        System.out.println(gift+"：支付验证通过");
        return true ;
    }
}

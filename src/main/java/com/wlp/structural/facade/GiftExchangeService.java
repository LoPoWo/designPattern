package com.wlp.structural.facade;

/**
 * 礼物兑换服务
 */
public class GiftExchangeService {

    /**
     * 真实业务使用spring 依赖注入
     *
     * 这里就直接new了
     */

    private IntergralValidateService intergralValidateService = new IntergralValidateService();
    private PayValidateService payValidateService = new PayValidateService();
    private ShipmentsService shipmentsService = new ShipmentsService();

    public boolean exchange(Gift gift){
        if(intergralValidateService.validate(gift)){
            if(payValidateService.validate(gift)){
                if(shipmentsService.shipments(gift)){
                    System.out.println(gift+":礼物兑换成功");
                    return true ;
                }
            }
        }

        System.out.println(gift+":礼物兑换失败");
        return false ;
    }
}

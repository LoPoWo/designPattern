package com.wlp.structural.facade;

/**
 * 积分验证服务
 */
public class IntergralValidateService {
    /**
     * 积分验证
     * @param gift
     * @return
     */
    public boolean validate(Gift gift){

        if(gift.getIntegral() > 1000){
            System.out.println(gift+":积分验证成功");
            return true ;
        }
        System.out.println("积分验证失败");
        return false;
    }
}

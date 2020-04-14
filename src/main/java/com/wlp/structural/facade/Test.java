package com.wlp.structural.facade;

/**
 * 外观模式，又叫门面模式
 *
 * 将同一模块的大量的子服务由一个具体的服务负责调用，应用层负责调用具体服务就行，不用关心其内部的复杂调用
 *
 * 外观模式主导外界与内部交流，与此相似的中介者模式是主导其内部与内部的交流
 */
public class Test {
    public static void main(String[] args) {
        GiftExchangeService giftExchangeService = new GiftExchangeService() ;
        Gift gift = new Gift("机械键盘",1001) ;

        //兑换礼物
        giftExchangeService.exchange(gift);
    }
}

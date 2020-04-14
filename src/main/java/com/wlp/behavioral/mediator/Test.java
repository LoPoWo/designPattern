package com.wlp.behavioral.mediator;

public class Test {
    public static void main(String[] args) {
        Buyer buyer = new Buyer("张三丰");
        Seller seller = new Seller("包租婆");
        Seller seller2 = new Seller("包租公");

        Medium medium = new EstateMedium();
        medium.register(buyer);
        medium.register(seller);
        medium.register(seller2);

        buyer.send("再涨点儿");
        seller.send("会被查的");
        seller2.send("你想涨多高，嘻嘻");
    }
}

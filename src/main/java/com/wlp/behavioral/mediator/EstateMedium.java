package com.wlp.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 房地产中介
 */
public class EstateMedium implements Medium{

    private List<Customer> customerList = new ArrayList<Customer>();

    public boolean register(Customer customer) {
        if(!customerList.contains(customer)){
            customer.setMedium(this);
            customerList.add(customer);
            return true;
        }
        return false;
    }

    public void replay(String fromName, String content) {
        for(Customer customer : customerList){
            String name = customer.getName();
            //自己不发
            if(!name.equals(fromName)){
                customer.receive(fromName,content);
            }
        }
    }
}

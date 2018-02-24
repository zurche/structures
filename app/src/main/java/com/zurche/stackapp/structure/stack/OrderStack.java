package com.zurche.stackapp.structure.stack;

import com.zurche.stackapp.structure.list.OrderList;
import com.zurche.stackapp.structure.model.Order;

/**
 * @author alejandro.zurcher
 */

public class OrderStack implements OrderStackActions {

    private OrderList orderList;

    public OrderStack() {
        this.orderList = new OrderList();
    }

    @Override
    public void push(Order newOrder) {
        orderList.insertFirst(newOrder);
    }

    @Override
    public Order pop() throws Exception {
        Order lastOrder = orderList.getLast();
        orderList.remove(lastOrder.getOrderId());
        return lastOrder;
    }
}

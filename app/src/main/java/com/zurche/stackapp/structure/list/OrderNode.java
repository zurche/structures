package com.zurche.stackapp.structure.list;

import com.zurche.stackapp.structure.model.Order;

/**
 * @author alejandro.zurcher
 *
 * The concrete implementation of a Node of List that holds {@link Order} data.
 */

public class OrderNode implements OrderNodeActions {

    private Order orderData;
    private OrderNode nextNode;

    @Override
    public void setData(Order orderData) {
        this.orderData = orderData;
    }

    @Override
    public Order getData() {
        return this.orderData;
    }

    @Override
    public void setNext(OrderNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public OrderNode getNext() {
        return this.nextNode;
    }
}

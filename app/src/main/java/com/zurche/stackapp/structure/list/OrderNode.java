package com.zurche.stackapp.structure.list;

import com.zurche.stackapp.structure.model.Order;

/**
 * @author alejandro.zurcher
 *
 * The actions that any Node that stores {@link Order} objects in a {@link OrderSingleLinkedList}
 * must implement.
 */

public interface OrderNode {

    void setData(Order orderData);

    void setNext(OrderNode orderNode);

    OrderNode getNext();
}

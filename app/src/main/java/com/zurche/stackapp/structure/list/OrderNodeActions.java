package com.zurche.stackapp.structure.list;

import com.zurche.stackapp.structure.model.Order;

/**
 * @author alejandro.zurcher
 *
 * The actions that any Node that stores {@link Order} objects in a {@link OrderSingleLinkedListActions}
 * must implement.
 */

public interface OrderNodeActions {

    void setData(Order orderData);

    Order getData();

    void setNext(OrderNode orderNode);

    OrderNode getNext();
}

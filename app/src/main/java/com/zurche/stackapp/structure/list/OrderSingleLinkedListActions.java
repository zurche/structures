package com.zurche.stackapp.structure.list;

import com.zurche.stackapp.structure.model.Order;

/**
 * @author alejandro.zurcher
 *
 * A Single Linked List that stores {@link Order} values.
 */

public interface OrderSingleLinkedListActions {

    void insertFirst(Order data);

    void insertLast(Order data);

    void clear();

    Order search(int orderId) throws Exception;

    Order getFirst() throws Exception;

    Order getLast() throws Exception;

    void remove(int orderIdToRemove) throws Exception;
}

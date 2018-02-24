package com.zurche.stackapp.structure.list;

import com.zurche.stackapp.structure.model.Order;

/**
 * @author alejandro.zurcher
 *
 * A Single Linked List that stores {@link Order} values.
 */

public interface OrderSingleLinkedList {

    void insertFirst(Order data);

    void insertLast(Order data);

    void clear();

    int search(int orderId);

}

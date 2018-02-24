package com.zurche.stackapp.structure.stack;

import com.zurche.stackapp.structure.model.Order;

/**
 * @author alejandro.zurcher
 *
 * The actions that every Order Stack must implement.
 */

public interface OrderStackActions {

    void push(Order newOrder);

    Order pop() throws Exception;
}

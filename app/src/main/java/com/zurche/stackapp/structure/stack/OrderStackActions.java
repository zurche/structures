package com.zurche.stackapp.structure.stack;

/**
 * @author alejandro.zurcher
 *
 * The actions that every Order Stack must implement.
 */

public interface OrderStackActions {

    void push(int number);

    int pop();
}

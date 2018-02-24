package com.zurche.stackapp.structure.list;

import com.zurche.stackapp.structure.model.Order;

/**
 * @author alejandro.zurcher
 *
 * A list of orders wich implements the {@link OrderSingleLinkedListActions} interface.
 */

public class OrderList implements OrderSingleLinkedListActions {

    private OrderNode firstNode;

    @Override
    public void insertFirst(Order data) {
        if (firstNode == null) {
            //If list is null, then create the first node.
            firstNode = new OrderNode();
            firstNode.setData(data);
        } else {
            //If first node exists, then store in aux and set next of new node to previous first.
            OrderNode aux = firstNode;
            firstNode = new OrderNode();
            firstNode.setData(data);
            firstNode.setNext(aux);
        }
    }

    @Override
    public void insertLast(Order data) {
        if (firstNode == null) { //If list is null, then create the first node.
            firstNode = new OrderNode();
            firstNode.setData(data);
        } else if (firstNode.getNext() == null) { //If first node is the only element of the list, set a new node as its next.
            OrderNode newNode = new OrderNode();
            newNode.setData(data);
            firstNode.setNext(newNode);
        } else { //If firstNode exists and has a nextNode, then search for the last node and set a new node as its next element.
            OrderNode newNode = new OrderNode();
            newNode.setData(data);
            OrderNode aux = firstNode;

            //While the next element is '!= null' assign to aux aux.getNext. When last element if found, set the newNode as its next element.
            do {
                if (aux.getNext() == null) {
                    aux.setNext(newNode);
                }
                aux = aux.getNext();
            } while (aux.getNext() != null);
        }
    }

    @Override
    public void clear() {
        firstNode = null;
    }

    @Override
    public Order search(int orderId) throws Exception {
        if(firstNode == null) {
            //If firstNode is null, list is empty
            throw new Exception("List is empty");
        } else {
            OrderNode aux = firstNode;
            do {
                if (aux.getData().getOrderId() == orderId) {
                    return aux.getData();
                }
                aux = aux.getNext();
            } while (aux.getNext() != null);
            throw new Exception("Order with orderId: " + orderId + " not found");
        }
    }

    @Override
    public Order getFirst() throws Exception {
        if(firstNode == null) {
            //If firstNode is null, list is empty
            throw new Exception("List is empty");
        } else {
            //If first node exists, return its data since its the first element
            return firstNode.getData();
        }
    }

    @Override
    public Order getLast() throws Exception {
        if(firstNode == null) {
            //If firstNode is null, list is empty
            throw new Exception("List is empty");
        } else if (firstNode.getNext() == null) {
            //If firstNode's next is null, firstNode is its only child
            return firstNode.getData();
        } else {
            //Otherwise we need to look for the last element of the list
            OrderNode aux = firstNode;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            return aux.getData();
        }
    }

    @Override
    public void remove(int orderIdToRemove) throws Exception {
        if (orderIdToRemove == firstNode.getData().getOrderId()) {
            //If order to remove is in first place, then simply point the first node to the next.
            firstNode = firstNode.getNext();
        } else {
            OrderNode prev = firstNode;
            OrderNode aux = firstNode.getNext();

            while(aux != null) {
                if (orderIdToRemove == aux.getData().getOrderId()) {
                    //If the order id to remove is in aux, then point the prev node to aux's next.
                    prev.setNext(aux.getNext());
                    return;
                } else {
                    //Otherwise update the prev and aux pointer to next values.
                    prev = aux;
                    aux = aux.getNext();
                }
            }

            //If this statement is reached it means the orderId is not included in any order of the list.
            throw new Exception("Order id: " + orderIdToRemove + " to remove not found");
        }
    }
}

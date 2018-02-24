package com.zurche.stackapp.structure.model;

/**
 * @author alejandro.zurcher
 *
 * A class that represents an Order.
 */

public class Order {

    private float totalPrice;
    private int orderId;
    private String meal;
    private String drink;
    private String clientName;

    public float getTotalPrice() {
        return totalPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getMeal() {
        return meal;
    }

    public String getDrink() {
        return drink;
    }

    public String getClientName() {
        return clientName;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}

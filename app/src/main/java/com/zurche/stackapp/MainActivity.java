package com.zurche.stackapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.zurche.stackapp.structure.model.Order;
import com.zurche.stackapp.structure.stack.OrderStack;

public class MainActivity extends AppCompatActivity {

    private OrderStack mOrderStack = new OrderStack();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pushOrder(View view) {
        Order order = new Order();
        order.setClientName("X");
        order.setDrink("G");
        order.setMeal("XC");
        order.setOrderId(8);
        order.setTotalPrice(15.25);
        mOrderStack.push(order);
    }

    public void popOrder(View view) {
        try {
            Order order = mOrderStack.pop();
            Log.d("MainActivity", order.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

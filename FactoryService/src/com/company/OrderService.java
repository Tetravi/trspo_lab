package com.company;

import java.util.ArrayList;

public class OrderService {
    final private ArrayList<Order> orders = new ArrayList<>();

    public void addOrder(String type, double amount, int price,
                         String provider){
        orders.add(new Order(type, amount, price, provider));
        System.out.println("Новый заказ добавлен");
        System.out.println(orders.toString());
    }

    public ArrayList<Order> getOrders(){
        return orders;
    }

    public boolean deleteOrder(Order order){
        return orders.remove(order);
    }
}

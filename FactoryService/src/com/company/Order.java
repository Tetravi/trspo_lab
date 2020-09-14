package com.company;

import java.util.Calendar;

final public class Order {
    final private String type;
    final private double amount;
    final private int price;
    final private String provider;
    final private Calendar date;
    final private Status status;

    Order(String type, double amount, int price, String provider) {
        this.type = type;
        this.amount = amount;
        this.price = price;
        this.provider = provider;
        this.date = Calendar.getInstance();
        this.status = Status.ORDERED;
    }

    public Status getStatus(){
        return status;
    }

    public int getPrice() { return price; }

    @Override
    public String toString(){
        return "{Заказ материалов типа " + type + " в количестве " + amount
                + " Поставщик: " + provider
                + " Дата заказа: " + date.getTime() + " Цена: " + price + "}";
    }
}

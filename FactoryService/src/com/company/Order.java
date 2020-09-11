package com.company;

import java.util.Calendar;

final public class Order {
    final private String type;
    final private double amount;
    final private String provider;
    final private Calendar date;
    final private Status status;

    Order(String type, double amount, String provider) {
        this.type = type;
        this.amount = amount;
        this.provider = provider;
        this.date = Calendar.getInstance();
        this.status = Status.ORDERED;
    }

    public Status getStatus(){
        return status;
    }

    @Override
    public String toString(){
        return "{Заказ материалов типа " + type + " в количестве " + amount
                + " Поставщик: " + provider
                + " Дата заказа: " + date.getTime() + "}";
    }
}

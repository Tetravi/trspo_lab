package com.company;

final public class Vehicle {
    final private Worker driver;
    final private String number;
    final private double maxWeight;
    private Order order;
    private Weight weight;
    private Status status;

    Vehicle(Worker driver, String number, double maxWeight) {
        this.driver = driver;
        this.number = number;
        this.maxWeight = maxWeight;
        this.status = Status.FREE;
    }

    public void setStatusBusy() { this.status = Status.BUSY; }

    public void setStatusFree(){
        this.status = Status.FREE;
    }

    public void setOrder(Order order ){
        this.order = order;
    }

    public void setWeight(Weight weight ){
        this.weight = weight;
    }

    public Order getOrder(){
        return order;
    }

    public Weight getWeight(){
        return weight;
    }

    public Worker getDriver() { return driver; }

    public Status getStatus(){
        return status;
    }

    @Override
    public String toString(){
        return "Номер транспорта: " + number + '\''
                + "Максимальная грузоподъемность: " + maxWeight + '\''
                + "Водитель: " + driver;
    }
}

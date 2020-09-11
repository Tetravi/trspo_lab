package com.company;

final public class Weight {
    final private String loader;
    final private String worker;
    private Status status;

    Weight(String loader, String worker) {
        this.loader = loader;
        this.worker = worker;
        this.status = Status.DELIVERING;
    }

    public Status getStatus(){
        return status;
    }

    public void setStatusReceived(){
        this.status = Status.RECEIVED;
    }

    @Override
    public String toString(){
        return "Грузчик " + loader + "принимает заказ для " + worker;
    }
}

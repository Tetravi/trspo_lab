package com.company;

final public class Weight {
    final private Worker loader;
    final private Worker worker;
    private Status status;

    Weight(Worker loader, Worker worker) {
        this.loader = loader;
        this.worker = worker;
        this.status = Status.DELIVERING;
    }

    public Status getStatus(){
        return status;
    }

    public Worker getLoader() { return loader; }

    public Worker getWorker() { return worker; }

    public void setStatusReceived(){
        this.status = Status.RECEIVED;
    }

    @Override
    public String toString(){
        return "Грузчик " + loader + "принимает заказ для " + worker;
    }
}

package com.company;

import java.util.ArrayList;

public class FirmService {
    final private ArrayList<Worker> workers = new ArrayList<>();
    private double totalFirmCash;

    public FirmService(double totalFirmCash) {
        this.totalFirmCash = totalFirmCash;
    }

    public void addWorker(String name, String job, int salary){
        workers.add(new Worker(name, job, salary));
        int index = workers.size();
        System.out.println("Рабочий " +  workers.get(index - 1).toString() + " добавлен");
    }

    public ArrayList<Worker> getWorkers() { return workers; }

    public boolean deleteWorker(Worker worker){
        return workers.remove(worker);
    }

    public double getTotalFirmCash() { return totalFirmCash; }

    public void cashOperations(Vehicle vehicle, Order order){
        vehicle.getWeight().getLoader().giveSalary(order.getPrice() * 0.1);
        vehicle.getWeight().getWorker().giveSalary(order.getPrice() * 0.1);
        vehicle.getDriver().giveSalary(order.getPrice() * 0.1);

        totalFirmCash -= order.getPrice();
    }
}

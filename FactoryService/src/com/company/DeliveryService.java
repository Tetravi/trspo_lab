package com.company;

import java.util.ArrayList;

public class DeliveryService {
    final private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Worker driver, String number,
                           double maxWeight){
        vehicles.add(new Vehicle(driver, number, maxWeight));
        System.out.println(vehicles.toString());
    }

    public boolean deleteVehicle(Vehicle vehicle){
        return vehicles.remove(vehicle);
    }

    public ArrayList<Vehicle> getVehicles(){
        return vehicles;
    }

    public void setVehicle(Order order){
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getStatus() == Status.BUSY)
                System.out.println("Транспорт уже занят");
            else {
                System.out.println("Транспорт {" + vehicle.toString() + "} будет отправлен за заказом");
                vehicle.setStatusBusy();
                vehicle.setOrder(order);
                break;
            }
        }
    }
}

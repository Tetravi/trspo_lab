package com.company;

public class Main {

    public static void main(String[] args) {

        DeliveryService deliveryService = new DeliveryService();

        System.out.println("Добавим новый транспорт в автопарк");
        deliveryService.addVehicle("Иван Иванов", "01234", 1000.0);

        OrderService orderservice = new OrderService();

        System.out.println("Добавим новый заказ");
        orderservice.addOrder("Ткань", 15.0, "ClothFactory");

        System.out.println("Отправляем транспорт на заказ");
        deliveryService.setVehicle(orderservice.getOrders().get(0));

        WeightService weightService = new WeightService();

        weightService.addWeight("Грузчик 1", "Работник 1");
        for (Vehicle vehicle: deliveryService.getVehicles()){
            if (vehicle.getStatus() == Status.BUSY
                && vehicle.getOrder() == orderservice.getOrders().get(0))

            {vehicle.setWeight(weightService.getWeights().get(0));
                weightService.unpackWeight(vehicle);}

        }
        System.out.println("После доставки грузчики приняли заказ, транспорт снова получил статус FREE");
    }
}

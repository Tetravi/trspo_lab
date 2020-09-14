package com.company;

public class Main {

    public static void main(String[] args) {

        DeliveryService deliveryService = new DeliveryService();

        FirmService firmService = new FirmService(10000);

        System.out.println("Добавим работников, грузчиков и водителей");
        firmService.addWorker("Иван Иванов", " водитель",0);
        firmService.addWorker(" Игорь ", " грузчик", 0);
        firmService.addWorker(" Василий", " работник", 0);

        System.out.println("Добавим новый транспорт в автопарк");
        deliveryService.addVehicle(firmService.getWorkers().get(0),
                "01234", 1000.0);

        OrderService orderservice = new OrderService();

        System.out.println("Добавим новый заказ");
        orderservice.addOrder("Ткань", 15.0, 100 ,"ClothFactory");

        System.out.println("Отправляем транспорт на заказ");
        deliveryService.setVehicle(orderservice.getOrders().get(0));

        WeightService weightService = new WeightService();

        weightService.addWeight(firmService.getWorkers().get(1),
                firmService.getWorkers().get(2));
        for (Vehicle vehicle: deliveryService.getVehicles()){
            if (vehicle.getStatus() == Status.BUSY
                && vehicle.getOrder() == orderservice.getOrders().get(0))

            {vehicle.setWeight(weightService.getWeights().get(0));
                weightService.unpackWeight(vehicle);}

        }
        System.out.println("После доставки грузчики приняли заказ, транспорт снова получил статус FREE");

        System.out.println("Проведем оплату заказа и начисление денег рабочим");
        firmService.cashOperations(deliveryService.getVehicles().get(0), orderservice.getOrders().get(0));

        System.out.println("Баланс работника " + firmService.getWorkers().get(0).getName() +
                " = " +  firmService.getWorkers().get(0).getSalary());
        System.out.println("Баланс работника " + firmService.getWorkers().get(1).getName() +
                " = " +  firmService.getWorkers().get(1).getSalary());
        System.out.println("Баланс работника " + firmService.getWorkers().get(2).getName() +
                " = " +  firmService.getWorkers().get(2).getSalary());

        System.out.println("Общий баланс фирмы = " + firmService.getTotalFirmCash());
    }
}

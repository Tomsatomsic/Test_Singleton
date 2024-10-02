package cz.spsmb.tomsa;


import factory.Car;
import factory.CarDealership;

public class Main {

    public static void main(String[] args) {
        CarDealership dealership = CarDealership.getInstance();

        Car car1 = new Car.carBuilder().setEngine("1.0L").setColor("red").setWheels("sport").setName("Skodovka").build();
        Car car2 = new Car.carBuilder().setEngine("2.0L").setColor("blue").setWheels("standard").setName("Golfik").build();

        dealership.orderCar(car1);
        dealership.orderCar(car2);
        dealership.printOrders();
    }
}

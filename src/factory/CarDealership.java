package factory;

import java.util.ArrayList;
import java.util.List;

public class CarDealership {
    private static CarDealership instance;
    private List<Car> orders;

    private CarDealership(){
        orders =new ArrayList<>();
    }
    public static CarDealership getInstance(){
        if(instance == null){
            instance = new CarDealership();
        }
        return instance;
    }
    public void  orderCar(Car car){
        orders.add(car);
    }
    public void printOrders(){
        System.out.println("All ordered cars: ");
        for (Car car:orders){
            System.out.println(car.carDetails());
        }
    }
}

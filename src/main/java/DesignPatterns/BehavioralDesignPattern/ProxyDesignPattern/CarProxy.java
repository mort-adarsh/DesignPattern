package DesignPatterns.BehavioralDesignPattern.ProxyDesignPattern;

import java.util.Objects;

public class CarProxy implements Car{
    Car car;
    String driver;

    public CarProxy(String driver) {
        this.driver = driver;
    }

    @Override
    public void drive() {
        if(Objects.equals(driver, "Adarsh")){
            car = new RealCar();
            System.out.print(driver + " can ");
            car.drive();
        }else{
            System.out.println(driver + " is not authorized to drive");
        }

    }
}

package DesignPatterns.BehavioralDesignPattern.ProxyDesignPattern;

public class Client {
    public static void main(String[] args) {
        Car car = new CarProxy("Adarsh");
        car.drive();

        Car car2 = new CarProxy("Salman Khan");
        car2.drive();

    }
}

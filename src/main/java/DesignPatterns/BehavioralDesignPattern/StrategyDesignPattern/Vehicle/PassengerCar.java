package DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.Vehicle;

import DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.DrivingStartegy.DrivingStrategy;

public class PassengerCar extends Vehicle {
    int numberOfSeat;

    public PassengerCar(int noOfwheels, String vehicleName, DrivingStrategy drivingStrategy, int numberOfSeat) {
        super(noOfwheels, vehicleName, drivingStrategy);
        this.numberOfSeat = numberOfSeat;
    }

}

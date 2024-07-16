package DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.Vehicle;

import DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.DrivingStartegy.DrivingStrategy;

public class Vehicle {
    int noOfwheels;
    String vehicleName;
    DrivingStrategy drivingStrategy;

    public Vehicle(int noOfwheels, String vehicleName, DrivingStrategy drivingStrategy) {
        this.noOfwheels = noOfwheels;
        this.vehicleName = vehicleName;
        this.drivingStrategy = drivingStrategy;
    }

    public void drive(){
        drivingStrategy.drive();
    }

    public DrivingStrategy getDrivingStrategy() {
        return drivingStrategy;
    }

    public void setDrivingStrategy(DrivingStrategy drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
    }
}

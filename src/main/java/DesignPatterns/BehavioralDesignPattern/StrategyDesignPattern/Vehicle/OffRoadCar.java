package DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.Vehicle;

import DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.DrivingStartegy.DrivingStrategy;

public class OffRoadCar extends Vehicle {

    int horsePower;

    public OffRoadCar(int noOfwheels, String vehicleName, DrivingStrategy drivingStrategy, int horsePower) {
        super(noOfwheels, vehicleName, drivingStrategy);
        this.horsePower = horsePower;
    }
}

package DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.Vehicle;

import DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.DrivingStartegy.DrivingStrategy;

public class RacingCar extends Vehicle {
    int topspeed;

    public RacingCar(int noOfwheels, String vehicleName, DrivingStrategy drivingStrategy, int topspeed) {
        super(noOfwheels, vehicleName, drivingStrategy);
        this.topspeed = topspeed;
    }
}

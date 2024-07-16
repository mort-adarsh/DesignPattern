package DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern;

import DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.DrivingStartegy.FastDriving;
import DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.DrivingStartegy.SlowDriving;
import DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.Vehicle.RacingCar;
import DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.Vehicle.Vehicle;

public class Client {

    public static void main(String[] args) {

        // racing car run fast;
        Vehicle racingCar = new RacingCar(4, "macLaren", new FastDriving(), 200);
        racingCar.drive();
        // lets make make my racing car drive slow
        racingCar.setDrivingStrategy(new SlowDriving());
        racingCar.drive();

    }

}

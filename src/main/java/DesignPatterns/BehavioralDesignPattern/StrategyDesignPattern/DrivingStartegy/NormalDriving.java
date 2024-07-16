package DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.DrivingStartegy;

public class NormalDriving implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("This is normal driving method");
    }
}

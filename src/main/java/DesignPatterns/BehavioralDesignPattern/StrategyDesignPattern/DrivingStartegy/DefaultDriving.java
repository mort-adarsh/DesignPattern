package DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.DrivingStartegy;

public class DefaultDriving implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("This is default driving method");
    }
}

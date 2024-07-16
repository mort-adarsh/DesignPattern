package DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.DrivingStartegy;

public class FastDriving implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("Attention, we are driving very fast");
    }
}

package DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.DrivingStartegy;

public class OffRoadDriving implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("Attention, we are off roading");
    }
}

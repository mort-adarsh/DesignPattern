package DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.DrivingStartegy;

public class SlowDriving implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("This is slow driving method, will get late");
    }
}

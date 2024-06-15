package DesignPatterns.CreationalDesignPatterns.BuilderPattern;

// Client Code
public class BuilderPatternExample {
    public static void main(String[] args) {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineer = new ConstructionEngineer(concreteHouseBuilder);

        House house = engineer.constructHouse();
        System.out.println("House is: " + house);
    }
}

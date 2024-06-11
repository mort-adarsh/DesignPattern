package DesignPatterns.CreationalDesignPatterns.FactoryPattern;

public class FactoryDesignPattern {

    private static Logistics logistics;

    public Logistics configure(String transportType) {

        if (transportType != null && transportType.equalsIgnoreCase("sea")) {
            logistics = new SeaLogistics();
        } else if(transportType != null && transportType.equalsIgnoreCase("land")) {
            logistics = new RoadLogistics();
        } else {
            throw new RuntimeException("No transport found");
        }
        return logistics;
    }

}

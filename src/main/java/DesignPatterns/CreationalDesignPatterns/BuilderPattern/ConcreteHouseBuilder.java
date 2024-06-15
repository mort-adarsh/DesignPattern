package DesignPatterns.CreationalDesignPatterns.BuilderPattern;

// Concrete Builder
public class ConcreteHouseBuilder implements HouseBuilder {
    private House house;

    public ConcreteHouseBuilder() { this.house = new House(); }

    @Override
    public void buildFoundation() { house.setFoundation("Concrete foundation"); }
    @Override
    public void buildStructure() { house.setStructure("Concrete and Steel Structure"); }
    @Override
    public void buildRoof() { house.setRoof("Concrete and Steel Roof"); }
    @Override
    public void buildInterior() { house.setInterior("Painting and Ceiling"); }
    @Override
    public House getHouse() { return this.house; }
}

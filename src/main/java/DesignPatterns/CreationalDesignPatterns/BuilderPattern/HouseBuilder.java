package DesignPatterns.CreationalDesignPatterns.BuilderPattern;

// Builder Interface
public interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void buildInterior();
    House getHouse();
}

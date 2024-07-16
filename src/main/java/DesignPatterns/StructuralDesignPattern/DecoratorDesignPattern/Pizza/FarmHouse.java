package DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Pizza;

public class FarmHouse extends BasicPizza {
    public FarmHouse() {
        this.pizzaName = "Farmhouse";
        System.out.println("Here  is your Farmhpuse  pizza ");
    }

    @Override
    public int cost() {
        System.out.println("Cost of farmhouse pizza "+ "120");
        return 120;
    }
}

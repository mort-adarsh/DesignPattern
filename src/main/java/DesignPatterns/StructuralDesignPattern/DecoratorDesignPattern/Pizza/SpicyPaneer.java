package DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Pizza;

public class SpicyPaneer extends BasicPizza {

    public SpicyPaneer() {
        this.pizzaName = "PaneerPizza";
        System.out.println("Here is your "+ pizzaName);
    }

    @Override
    public int cost() {
        System.out.println("Cost of paneer pizza "+ "130");
        return 130;
    }
}

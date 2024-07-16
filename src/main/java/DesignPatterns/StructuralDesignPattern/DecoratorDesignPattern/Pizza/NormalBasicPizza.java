package DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Pizza;

public class NormalBasicPizza extends BasicPizza {
    public NormalBasicPizza() {
        this.pizzaName = "BasicPizza";
        System.out.println("Here  is your normal pizza ");
    }

    @Override
    public int cost() {
        System.out.println("Cost of normal basic pizza "+ "100");
        return 100;
    }
}

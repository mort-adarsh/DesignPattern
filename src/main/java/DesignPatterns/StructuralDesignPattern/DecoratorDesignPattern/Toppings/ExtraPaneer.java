package DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Toppings;

import DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Pizza.BasicPizza;

public class ExtraPaneer extends ToppingDecorator{

    BasicPizza basicPizza;

    public ExtraPaneer(BasicPizza basicPizza) {
        System.out.println("Adding Extraa Paneer");
        this.basicPizza = basicPizza;
    }

    @Override
    public int cost() {
        System.out.println("Cost of extra paneer "+"30");
        return this.basicPizza.cost()+30;
    }
}

package DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Toppings;

import DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Pizza.BasicPizza;

public class ExtraChesse extends ToppingDecorator{

    BasicPizza basicPizza;

    public ExtraChesse(BasicPizza basicPizza) {
        System.out.println("Adding Extraa Chesse");
        this.basicPizza = basicPizza;
    }

    @Override
    public int cost() {
        System.out.println("Cost of extra Chesse "+"20");
        return this.basicPizza.cost()+20;
    }
}

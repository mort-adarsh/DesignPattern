package DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Toppings;

import DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Pizza.BasicPizza;

public class ExtraMushroom extends ToppingDecorator{

    BasicPizza basicPizza;

    public ExtraMushroom(BasicPizza basicPizza) {
        System.out.println("Adding Extraa Mushroom");
        this.basicPizza = basicPizza;
    }

    @Override
    public int cost() {
        System.out.println("cost of extra Mushroom "+"10");
        return this.basicPizza.cost()+10;
    }
}

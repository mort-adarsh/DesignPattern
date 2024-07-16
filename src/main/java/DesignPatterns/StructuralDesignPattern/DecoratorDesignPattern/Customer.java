package DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern;

import DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Pizza.BasicPizza;
import DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Pizza.SpicyPaneer;
import DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Toppings.ExtraChesse;
import DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Toppings.ExtraPaneer;


public class Customer {
    public static void main(String[] args) {

        BasicPizza pizza = new ExtraChesse(new ExtraPaneer(new SpicyPaneer()));
        System.out.println("Total Cost " + pizza.cost());
        System.out.println("--------------------------------------------");
        BasicPizza pizza2 =  new ExtraPaneer(new ExtraPaneer(new ExtraPaneer(new ExtraPaneer(new SpicyPaneer()))));
        System.out.println("Total Cost " + pizza2.cost());
    }
}

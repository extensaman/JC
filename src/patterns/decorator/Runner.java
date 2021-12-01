package patterns.decorator;

import patterns.decorator.addon.Milk;
import patterns.decorator.addon.Sugar;
import patterns.decorator.beverage.Beverage;
import patterns.decorator.beverage.BlackTea;
import patterns.decorator.beverage.GreenTea;

public class Runner {

    public static void main(String[] args) {

        Beverage beverage01 = new GreenTea();
        beverage01 = new Milk(beverage01);
        beverage01 = new Sugar(beverage01);

        System.out.println("Beverage: " + beverage01.getDescription());
        System.out.println("Cost: " + beverage01.getCost());

        Beverage beverage02 = new BlackTea();
        beverage02 = new Sugar(beverage02);

        System.out.println("Beverage: " + beverage02.getDescription());
        System.out.println("Cost: " + beverage02.getCost());
    }
}

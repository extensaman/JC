package patterns.decorator.addon;

import patterns.decorator.beverage.Beverage;

public class Milk extends Decorator {

    private Beverage beverage;

    public Milk (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float getCost () {
        return beverage.getCost() + AddonInfo.MILK.price;
    }

    @Override
    public String getDescription () {
        return beverage.getDescription() + " & " + AddonInfo.MILK.name;
    }
}

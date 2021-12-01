package patterns.decorator.addon;

import patterns.decorator.beverage.Beverage;

public class Sugar extends Decorator {
    private Beverage beverage;

    public Sugar (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float getCost () {
        return beverage.getCost() + AddonInfo.SUGAR.price;
    }

    @Override
    public String getDescription () {
        return beverage.getDescription() + " & " + AddonInfo.SUGAR.name;
    }
}

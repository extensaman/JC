package patterns.decorator.beverage;

public abstract class Beverage {

    protected BeverageInfo kind;

    public String getDescription () {

        return kind.description;
    }

    public abstract float getCost();
}

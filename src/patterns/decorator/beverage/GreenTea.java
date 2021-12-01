package patterns.decorator.beverage;

public class GreenTea extends Beverage {

    public GreenTea () {
        this.kind = BeverageInfo.GREEN_TEA;
    }

    @Override
    public float getCost () {
        return kind.price;
    }
}

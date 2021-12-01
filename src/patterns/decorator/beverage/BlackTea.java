package patterns.decorator.beverage;

public class BlackTea extends Beverage {
    public BlackTea () {
        this.kind = BeverageInfo.BLACK_TEA;
    }

    @Override
    public float getCost () {
        return kind.price;
    }
}

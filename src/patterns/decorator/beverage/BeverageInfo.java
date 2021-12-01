package patterns.decorator.beverage;

public enum BeverageInfo {

    GREEN_TEA ("Green Tea", 1.2f),
    BLACK_TEA ("Black Tea", 1.0f);

    String description;
    float price;

    BeverageInfo(String description, float price) {
        this.description = description;
        this.price = price;
    }
}

package patterns.decorator.addon;

public enum AddonInfo {

    MILK ("Milk", 0.3f),
    SUGAR ("Sugar", 0.1f);

    String name;
    float price;

    AddonInfo (String name, float price) {
        this.name = name;
        this.price = price;
    }
}

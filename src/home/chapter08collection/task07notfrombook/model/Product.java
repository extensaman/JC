package home.chapter08collection.task07notfrombook.model;

public final class Product {

    private final String type;
    private final double price;

    public Product(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Product obj = (Product) o;

        return this.type.equals(obj.type) && this.price == obj.price;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(price) + type.hashCode();
    }

    @Override
    public String toString() {
        return "Product: type = " + type + " price = " + price;
    }
}

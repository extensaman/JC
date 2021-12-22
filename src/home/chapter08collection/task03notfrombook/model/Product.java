package home.chapter08collection.task03notfrombook.model;

import java.util.Objects;

public class Product {

    private final double size;
    private final double price;

    @Override
    public String toString() {
        return "Product{" +
                "size=" + size +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.size, size) == 0 &&
                Double.compare(product.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, price);
    }

    public double getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public Product(double size, double price) {
        this.size = size;
        this.price = price;
    }
}

package home.chapter08collection.task02notfrombook.model;

import java.util.Objects;

public final class HeavyBox {

    private final double size;
    private final double weight;

    public HeavyBox(double size, double weight) {
        this.size = size;
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "size=" + size +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, weight);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavyBox heavyBox = (HeavyBox) o;
        return Double.compare(heavyBox.size, size) == 0 &&
                Double.compare(heavyBox.weight, weight) == 0;
    }
}

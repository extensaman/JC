package home.chapter08collection.task08notfrombook.model;

import java.util.Objects;

public final class HeavyBox implements Comparable<HeavyBox>{

    private final double weight;
    private final double size;

    public HeavyBox(double weight, double size) {
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
                "weight=" + weight +
                ", size=" + size +
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

    @Override
    public int compareTo (HeavyBox obj) {

        if (obj == null) {
            throw new IllegalArgumentException();
        }

        double weightDelta = this.weight - obj.weight;

        if (weightDelta > 0) {
            return 1;
        } else if (weightDelta < 0) {
            return -1;
        } else {

            double sizeDelta = this.size - obj.size;

            if (sizeDelta > 0) {
                return 1;
            } else if (sizeDelta < 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}


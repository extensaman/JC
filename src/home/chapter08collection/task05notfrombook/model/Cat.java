package home.chapter08collection.task05notfrombook.model;

public class Cat extends Pet{

    private final String color;

    public Cat(String owner, String color) {
        super(owner);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString() +
                " color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        if (!super.equals(o)) {
            return false;
        }

        Cat obj = (Cat) o;

        if (this.color == null) {
            return obj.color == null;
        }

        return this.color.equals(obj.color);
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + color.hashCode();
    }
}

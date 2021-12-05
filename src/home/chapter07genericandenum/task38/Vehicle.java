package home.chapter07genericandenum.task38;

public abstract class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle () {
        this.name = "";
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }

    @Override
    public boolean equals (Object o) {

        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Vehicle obj = (Vehicle) o;

        return this.equals(obj);
    }

    @Override
    public int hashCode() {
        return (this == null) ? 0 : this.hashCode();
    }
}

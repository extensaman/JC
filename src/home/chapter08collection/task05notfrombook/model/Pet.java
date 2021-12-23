package home.chapter08collection.task05notfrombook.model;

public abstract class Pet {

    private static int counter = 0;
    private final int id;
    private final String owner;

    public Pet(String owner) {
        this.id = counter++;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", owner='" + owner + '\'';
    }

    @Override
    public boolean equals (Object o) {

        Pet obj = (Pet) o;

        if (this.owner == null) {
            return obj.owner == null;
        }
        return this.owner.equals(obj.owner);
    }

    @Override
    public int hashCode() {
        return owner.hashCode();
    }
}

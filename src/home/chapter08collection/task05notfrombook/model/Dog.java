package home.chapter08collection.task05notfrombook.model;

public final class Dog extends Pet{

    private final String breed;

    public Dog(String owner, String breed) {
        super(owner);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() +
                " breed='" + breed + '\'' +
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

        Dog obj = (Dog) o;

        if (this.breed == null) {
            return obj.breed == null;
        }

        return this.breed.equals(obj.breed);
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + breed.hashCode();
    }
}

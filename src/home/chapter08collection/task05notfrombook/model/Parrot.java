package home.chapter08collection.task05notfrombook.model;

public class Parrot extends Pet{

    private final String placeOfOrigin;

    public Parrot(String owner, String placeOfOrigin) {
        super(owner);
        this.placeOfOrigin = placeOfOrigin;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    @Override
    public String toString() {
        return "Parrot{" + super.toString() +
                " placeOfOrigin='" + placeOfOrigin + '\'' +
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

        Parrot obj = (Parrot) o;

        if (this.placeOfOrigin == null) {
            return obj.placeOfOrigin == null;
        }

        return this.placeOfOrigin.equals(obj.placeOfOrigin);
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + placeOfOrigin.hashCode();
    }
}

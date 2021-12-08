package home.chapter08collection.task39.misc;

public enum MagicNumbers {
    MAXIMUM_MARK (10),
    MINIMUM_MARK (3),
    MARKS_COUNT (9);

    private int value;

    MagicNumbers (int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

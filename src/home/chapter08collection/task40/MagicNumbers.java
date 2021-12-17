package home.chapter08collection.task40;

public enum MagicNumbers {

    DEFAULT_LIST_SIZE (10),
    NUMBERS_UPPER_LIMIT (9);

    private int value;

    MagicNumbers (int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

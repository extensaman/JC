package home.chapter08collection.task41;

public enum MagicNumbers {

    DEFAULT_MARKS_COOUNT (10),
    DEFAULT_MAX_MARK (10),
    DEFAULT_ADDING_COUNT (100_000),
    DEFAULT_SAMPLE_SIZE (100_000),
    DEFAULT_VALUE_FOR_INSERT (100);

    private int value;

    MagicNumbers(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

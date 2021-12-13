package home.chapter05strings.task31.misc;

public enum MagicNumbers {
    CYCLES_COUNT (1000);

    private int value;

    MagicNumbers (int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

package home.chapter08collection.task41;

public enum MagicNumbers {

    DEFAULT_MARKS_COOUNT (10),
    DEFAULT_MAX_MARK (10);

    private int mark;

    MagicNumbers(int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }
}

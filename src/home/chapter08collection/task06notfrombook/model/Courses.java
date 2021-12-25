package home.chapter08collection.task06notfrombook.model;

public enum Courses {
    FIRST ("первый"),
    SECOND ("второй"),
    THIRD ("третий"),
    FOURTH ("четвертый"),
    FIFTH ("пятый");

    private String value;

    Courses (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

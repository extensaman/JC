package home.chapter07genericandenum.task37;

public enum Seasons {

    WINTER (90, "snowy"),
    SPRING (92, "warm"),
    SUMMER (92, "hot"),
    AUTUMN (92, "cold");

    private int countOfDays;
    private String description;

    Seasons(int countOfDays, String description) {
        this.countOfDays = countOfDays;
        this.description = description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public String getDescription() {
        return description;
    }
}

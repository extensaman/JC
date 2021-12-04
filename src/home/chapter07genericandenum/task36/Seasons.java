package home.chapter07genericandenum.task36;

/**
 * Раздел "Generics и Enum"
 * Задание №36
 *
 * Написать метод, который выводит следующий сезон от заданного во входном
 * параметре. Входной параметр ввести с клавиатуры.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

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

package home.chapter13datetime.task66;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Раздел "Date Time API"
 * Задание №66
 *
 * От текущей даты вывести на экран дату, которая была 60 дней назад.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final int DAYS_TO_SUBTRACT = 60;
    public static final String PATTERN = "d::MMMM:uuuu";

    private static final LocalDate date = LocalDate.now();

    public static void main(String[] args) {

        System.out.println("Сегодня " + formatDate(date));
        System.out.println("60 дней назад было " + formatDate(date.minusDays(DAYS_TO_SUBTRACT)));

    }

    private static String formatDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern(PATTERN));
    }
}

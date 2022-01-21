package home.chapter13datetime.task65;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Раздел "Date Time API"
 * Задание №65
 *
 * От текущей даты вывести расписание всех встреч, которые происходят
 * еженедельно в 13:00 в течение 2 месяцев.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final int MONTHS_TO_ADD = 2;
    public static final int WEEKS = 1;
    public static final int HOUR = 13;
    public static final int MINUTE = 00;
    public static final String PATTERN = "d::MMMM::uuuu  HH:mm";

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        List<String> list = date.datesUntil(date.plusMonths(MONTHS_TO_ADD), Period.ofWeeks(WEEKS))
                .map(d -> d.atTime(HOUR, MINUTE))
                .map(d -> d.format(DateTimeFormatter.ofPattern(PATTERN)))
                .collect(Collectors.toList());

        Output.printList(list);

    }
}

package home.chapter13datetime.task64;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Раздел "Date Time API"
 * Задание №64
 *
 * Ввести с клавиатуры номер месяца текущего года. Вывести на экран все его
 * даты в формате d::MMM::uuuu.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final int YEAR = 2022;
    public static final int DAY_OF_MONTH = 1;
    public static final int MONTHS_TO_ADD = 1;
    public static final String PATTERN = "d::MMMM::uuuu";

    public static void main(String[] args) {

        Output.printMessage("Enter a month number: ");

        int m = Input.inputInteger();

        LocalDate date = LocalDate.of(YEAR,m, DAY_OF_MONTH) ;

        List<String> list = date.datesUntil(date.plusMonths(MONTHS_TO_ADD))
                                .map(d -> d.format(DateTimeFormatter.ofPattern(PATTERN)))
                                .collect(Collectors.toList());

        Output.printList(list);

    }
}

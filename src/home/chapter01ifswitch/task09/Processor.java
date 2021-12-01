package home.chapter01ifswitch.task09;

/**
 * Раздел "Операторы if/switch"
 * Задание №09
 *
 * Задать три числа – день, месяц, год.
 * Вывести на экран в виде трех чисел дату следующего дня.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Processor {

    private Date date;

    public Processor(Date date) {
        this.date = date;
    }

    public Date nextDate () {
        int day = date.getDay();
        int month = date.getMonth();
        int year = date.getYear();
        boolean leapYear = date.isLeapYear();

        if (day == 31) {

            if (month == 12) {

                return new Date (1, 1, year + 1);
            } else {

                return new Date (1, month + 1, year);
            }
        }

        if (    (day == 30
                    &&
                    (   month == 4 ||
                        month == 6 ||
                        month == 9 ||
                        month == 11
                    )
                )
                ||
                (day == 28 && month == 2 && !leapYear)
                ||
                (day == 29 && month == 2 && leapYear)
            ) {

                return new Date (1, month + 1, year);
        }

        return new Date (day + 1, month, year);
    }
}

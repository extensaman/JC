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

public class Date {

    private int day;
    private int month;
    private int year;
    private boolean leapYear;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        return leapYear;
    }

    public Date(int day, int month, int year) {
        System.out.println("Cjnstructor: " + day + " " + month + " " + year);
        if (day < 1) {
            System.out.println("Wrong day format. Set to \'1\'.");
            day = 1;
        }
        if (month < 1) {
            System.out.println("Wrong month format. Set to \'1\'.");
            month = 1;
        }
        if (year < 1) {
            System.out.println("Wrong year format. Set to \'1\'.");
            year = 1;
        }
        if (month > 12) {
            System.out.println("Wrong month format. Set to \'12\'.");
            month = 12;
        }
        if (year > 3000) {
            System.out.println("Wrong year format. Set to \'3000\'.");
            year = 3000;
        }

        leapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? true : false;

        if (    (month == 1 ||
                month == 3 ||
                month == 5 ||
                month == 7 ||
                month == 8 ||
                month == 10 ||
                month == 12)

                        && day > 31)
        {
            System.out.println("Wrong day format. Set to \'31\'.");
            day = 31;
        } else if (
                (month == 4 ||
                month == 6 ||
                month == 9 ||
                month == 11)

                        && day > 30)
        {
            System.out.println("Wrong day format. Set to \'30\'.");
            day = 30;
        } else if (month == 2 && day > 28 && !leapYear) {
            System.out.println("Wrong day format. Set to \'28\'.");
            day = 28;
        } else if (month == 2 && day > 29 && leapYear) {
            System.out.println("Wrong day format. Set to \'29\'.");
            day = 29;
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}

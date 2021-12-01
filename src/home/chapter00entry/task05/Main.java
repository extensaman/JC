package home.chapter00entry.task05;

/**
 * Раздел "Типы данных. Переменные. Операторы. Методы"
 * Задание №5
 *
 * Задать промежуток времени в секундах в виде переменной. Следует вывести
 * его на экран в в иде часов минут и секунд, суток и недель.
 */

public class Main {

    public static void main(String[] args) {

        long time = 1_000_000_000_000L;

        System.out.println(time + " seconds equals");

        byte seconds = (byte) (time % 60L);
        time /= 60L;

        byte minutes = (byte) (time % 60L);
        time /= 60L;

        byte hours = (byte) (time % 24L);

        time /= 24L;

        byte days = (byte) (time % 7L);

        int weeks = (int) (time /= 7L);

        System.out.println(weeks + " weeks, "
                        + days + " days, " +
                        + hours + " hours, " +
                        + minutes + " minutes, " +
                        + seconds + " seconds.");
    }
}

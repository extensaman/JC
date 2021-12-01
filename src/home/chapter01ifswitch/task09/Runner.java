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

public class Runner {
    public static void main(String[] args) {

        Date date01 = new Date(31,5,3);
        System.out.println(date01);

        Processor processor = new Processor(date01);

        Date date02 = processor.nextDate();
        System.out.println(date02);
    }
}

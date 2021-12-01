package home.chapter01ifswitch.task08;

/**
 * Раздел "Операторы if/switch"
 * Задание №08
 *
 * Задать целое число в виде переменной, это число – сумма денег в рублях.
 * Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static void main(String[] args) {

        Money value = new Money(45);
        System.out.println(value);

        for (int i = 0; i < 10; i++) {
            value.setValue((int) (Math.random() * 100.0) + 1);
            System.out.println(value);
        }
    }
}

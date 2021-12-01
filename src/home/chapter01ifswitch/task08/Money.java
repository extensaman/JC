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

public class Money {

    private int value;

    public Money(int number) {
        this.value = number;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int number) {
        this.value = number;
    }

    public String getEndingText () {

        int lastDigit = this.value % 10;
        String word;

        switch (lastDigit) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                word = " рублей";
                break;
            case 1:
                word = " рубль";
                break;
            case 2:
            case 3:
            case 4:
                word = " рубля";
                break;
            default:
                word = " руб.";
        }

        return word;
    }

    @Override
    public String toString() {

        return value + getEndingText();
    }
}

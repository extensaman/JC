package home.chapter02cycles.task17;

/**
 * Раздел "Циклы"
 * Задание №17
 *
 * Задать произвольное целое число и вывести его в бухгалтерском формате, то есть, начиная справа,
 * каждые три позиции отделяются пробелом.
 * Например, число 20023143 должно быть выведено как 20 023 143.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Number {

    long number;

    public Number(long number) {
        this.number = number;
    }

    @Override
    public String toString() {

        String str ="";
        boolean isNegative = false;

        if (number < 0) {
            isNegative = true;
        }

        long n = Math.abs(number);

        int rank = 0;
        do {

            if (rank == 3) {
                str = ' ' + str;
                rank = 0;
            }

            str = (n % 10) + str;
            n /= 10;
            rank++;

        } while (n > 0);

        if (isNegative) {
            return '-' + str;
        }

        return str;
    }
}

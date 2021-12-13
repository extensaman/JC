package home.chapter05strings.task31;

import home.chapter05strings.task31.entity.Entity;
import home.chapter05strings.task31.logic.*;

/**
 * Раздел "Строки и регулярные выражения"
 * Задание №31
 *
 * Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”, один с помощью оператора сложения и String,
 * а другой с помощью StringBuilder и метода append.
 * Сравните скорость их выполнения. Выведите сравнение на экран.
 * (Можно использовать патерн стратегия)
 */

public class Runner {

    public static void main(String[] args) {

        Entity entity = new Entity();

        Uniter uniterStingBuilder = new Uniter(new StringBuilderAppender());
        Uniter uniterString = new Uniter(new StringConcatter());

        Calculator calculator = new Calculator(entity, uniterStingBuilder, uniterString);
        Result result = calculator.calculateResult();

        System.out.println(result);
    }
}

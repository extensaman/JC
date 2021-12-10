package home.chapter05strings.task31;

import home.chapter05strings.task31.entity.Entity;
import home.chapter05strings.task31.logic.StringBuilderAppender;
import home.chapter05strings.task31.logic.StringConcatter;
import home.chapter05strings.task31.logic.Uniter;
import home.chapter05strings.task31.misc.MagicNumbers;

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

        double stringConcatTime = uniterString.calculateTime(entity);
        System.out.println(MagicNumbers.CYCLES_COUNT.getValue() +
                            " плюсовых конкатенаций строки \"" + entity + "\" происходят за " +
                            stringConcatTime + " наносекунд");

        double stringBufferAppendTime = uniterStingBuilder.calculateTime(entity);
        System.out.println(MagicNumbers.CYCLES_COUNT.getValue() +
                " append-ов \"" + entity + "\" происходят за " +
                stringBufferAppendTime + " наносекунд");

        System.out.println("StringBuffer производительнее String в " +
                            (stringConcatTime / stringBufferAppendTime) + " раз");
    }
}

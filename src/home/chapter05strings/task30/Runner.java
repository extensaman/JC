package home.chapter05strings.task30;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Раздел "Строки и регулярные выражения"
 * Задание №30
 *
 * Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке
 * всех тегов абзацев, в том числе тех, у которых есть параметры, например,
 * <р id="p1">, и замену их на простые теги. абзацев <р>. Результат работы метода
 * выведите на экран.
 */

public class Runner {

    public static final String regex = "<p .+?>";
    public static final String insertText = "<p>";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();

        // можно использовать для хардкорного тестирования
        //str = "<p id = sd > ajslkfjaklfj </p> afak<p> ds kfjlskdjf </p> dsf <p asf= \"asa \" p af >";

        String trimmedString = str.trim();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(trimmedString);

        String result = matcher.replaceAll(insertText);
        System.out.println("Результат: " + result);
    }
}

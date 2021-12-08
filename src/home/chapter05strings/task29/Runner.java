package by.homework.task29;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Раздел "Строки и регулярные выражения"
 * Задание №29
 *
 * Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке
 * шестнадцатеричных чисел, записанных по правилам Java, с помощью регулярных
 * выражений. Результат работы метода выведите на экран.
 */

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();

        String trimmedString = str.trim();
        Pattern pattern = Pattern.compile("0[xX][0-9a-fA-F]{1,4}");
        Matcher matcher = pattern.matcher(str);

        System.out.println("Найдены следующие шестнадцатиричные числа: ");
        while (matcher.find()) {
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }
    }
}

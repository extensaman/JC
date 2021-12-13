package home.chapter05strings.task28;

import java.util.Scanner;

/**
 * Раздел "Строки и регулярные выражения"
 * Задание №28
 *
 * Введите с клавиатуры текст. Выведите на экран текст, составленный из
 * последних букв всех слов из исходного текста.
 */

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();

        String trimmedString = str.trim();
        String[] stringArray = trimmedString.split("\\s+");

        char[] result = new char[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {

            result[i] = stringArray[i].charAt((stringArray[i].length() - 1));

        }

        System.out.println("Текст, составленный из последних букв всех слов из исходного текста: "
                                + new String(result));
    }
}

package home.chapter05strings.task26;

/**
 * Раздел "Строки и регулярные выражения"
 * Задание №26
 *
 * Введите с клавиатуры строку. Найти в строке не только запятые, но и другие
 * знаки препинания. Подсчитать общее их количество.
 */

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {

        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String stringWithoutPunctuation = str.replaceAll("\\p{Punct}", "");

        System.out.println("Количество знаков препинания = " + (str.length() - stringWithoutPunctuation.length()));

    }
}

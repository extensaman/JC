package by.homework.task27;

/**
 * Раздел "Строки и регулярные выражения"
 * Задание №27
 *
 * Введите с клавиатуры текст. Подсчитать количество слов в тексте. Учесть, что
 * слова могут разделяться несколькими пробелами, в начале и конце текста также
 * могут быть пробелы, но могут и отсутствовать.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String trimmedString = str.trim();
        String[] stringArray = trimmedString.split("\\s+");
        System.out.println("Количество слов = " + stringArray.length + '\n' + Arrays.toString(stringArray));
    }
}

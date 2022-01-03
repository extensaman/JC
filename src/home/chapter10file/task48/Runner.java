package home.chapter10file.task48;

import home.chapter10file.task48.service.FileNumberService;
import home.chapter10file.task48.service.FileNumberServiceBehavior;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * Раздел "Работа с файлами"
 * Задание №48
 *
 * Создать файл с текстом, в котором присутствуют числа. Найти все числа,
 * вывести на экран, посчитать сумму, убрать все повторяющиеся числа и снова вывести на экран.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final String NUMBER_REGEX = "-?[0-9]+";

    public static void main(String[] args) {

        FileNumberServiceBehavior behavior = new FileNumberService();

        while(true) {

            System.out.println("Введите путь к файлу с данными или \'//\' для выхода: ");
            String path = behavior.inputLine();

            if (path.equals("//")) {
                break;
            }

            List<String> list = null;

            try {
                list = behavior.readTextFromFile(path);
            }
            catch (FileNotFoundException e) {
                System.out.println("Файл не найден. Попробуйте еще раз");
                continue;
            }
            catch (IOException e) {
                e.printStackTrace();
                break;
            }

            System.out.println("В файле находится следующий текст: ");
            behavior.printList(list);

            List<Integer> ints = behavior.recognizeIntegersInText(list, NUMBER_REGEX);

            System.out.println("\nВ тексте распознаны следующие числа: ");
            behavior.printList(ints);

            System.out.println("\nСумма чисел = " + behavior.sumArrayElements(ints));

            behavior.deleteRepeatElements(ints);

            System.out.println("\nПосле удаления повторяющихся чисел: ");
            behavior.printList(ints);

        }
    }
}

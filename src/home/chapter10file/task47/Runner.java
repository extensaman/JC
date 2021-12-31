package home.chapter10file.task47;

import home.chapter10file.task47.service.FileTextProcessor;
import home.chapter10file.task47.service.FileTextProcessorBehavior;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * Раздел "Работа с файлами"
 * Задание №47
 *
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
 * препинания и слов. Вывести результат на экран.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final String PUNCTUAL_REGEX = "\\p{Punct}";
    public static final String WORD_REGEX = "[0-9a-zA-Zа-яА-Я]+";

    public static void main(String[] args) {

        FileTextProcessorBehavior behavior = new FileTextProcessor();

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

            behavior.printList(list);

            System.out.println("Количество знаков препинания = " + behavior.calculateMatches(list, PUNCTUAL_REGEX));
            System.out.println("Количество слов = " + behavior.calculateMatches(list, WORD_REGEX));

        }
    }
}

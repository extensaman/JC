package home.chapter10file.task01notfrombook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Раздел "Работа с файлами"
 * Задание №01 (не из пособия)
 *
 * Прочесть из файла строки слов.
 * Найти наибольше повторяющееся слово и вывести его на экран.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final String FILE_PATH = "D:/fileWithWords.txt";

    public static void main(String[] args) {

        File file = new File(FILE_PATH);

        Map<String, Integer> map = new HashMap<>();

        try (
                BufferedReader reader = new BufferedReader(
                        new FileReader(file)
                );
        ) {
            while (reader.ready()) {
                String key = reader.readLine();

                Integer value = map.get(key);
                map.put(key, (value == null) ? 1 : value + 1);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        int max = 0;
        String mostRepeatingWord = null;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > max) {
                max = entry.getValue();
                mostRepeatingWord = entry.getKey();
            }
        }

        if (mostRepeatingWord != null) {
            System.out.println("Most repeating word is " + mostRepeatingWord);
        } else {
            System.out.println("File is empty or doesn't exist");
        }

    }
}

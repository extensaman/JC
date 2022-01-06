package home.chapter10file.task01notfrombook;

import home.chapter10file.task01notfrombook.service.Service;

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

        Service service = new Service();

        Map<String, Integer> map = service.createMapFromFile(FILE_PATH);

        String mostFrequentlyKey = service.searchMostFrequentlyKey(map);

        service.printResult(mostFrequentlyKey);

    }




}

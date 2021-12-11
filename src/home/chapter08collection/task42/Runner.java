package home.chapter08collection.task42;

import home.chapter08collection.task42.entity.Data;
import home.chapter08collection.task42.entity.Result;
import home.chapter08collection.task42.logic.DataInput;
import home.chapter08collection.task42.logic.DataProcessor;
import home.chapter08collection.task42.logic.ResultMaker;

import java.util.HashMap;
import java.util.Map;

/**
 * Раздел "Коллекции"
 * Задание №42
 *
 * Ввести текст с клавиатуры. Для текста создать Мар, где ключом будет слово, а
 * значение - количество повторений этого слова в тексте.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final String regex = "\\s+";

    public static void main(String[] args) {

        System.out.println("Enter a next: ");
        Data data = DataInput.inputData();

        String[] strings = DataProcessor.splitData(data, regex);

        Result result = ResultMaker.makeResult(strings);

        System.out.println(result);

    }
}

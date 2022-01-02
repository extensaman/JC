package home.chapter08collection.task42.logic;

import home.chapter08collection.task42.entity.Data;

public class DataProcessor {

    public static String[] splitData (Data data, String regex) {
        return data.getData().split(regex);
    }
}

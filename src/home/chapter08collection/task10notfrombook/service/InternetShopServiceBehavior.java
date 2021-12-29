package home.chapter08collection.task10notfrombook.service;

import java.util.Map;

public interface InternetShopServiceBehavior {
    public abstract Map<String, Map<String, Integer>> recognizeInputData(String inputData);
    public abstract void printInternetShopData(Map<String, Map<String, Integer>> map);
}

package home.chapter08collection.task07notfrombook.service;

import home.chapter08collection.task07notfrombook.model.Product;

import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class ProductMapKeySetPrintService implements Consumer<Map<String, Product>> {

    @Override
    public void accept(Map<String, Product> stringProductMap) {

        System.out.println("Печатаем ключи...");
        Set<String> keySet = stringProductMap.keySet();

        for (String key : keySet) {
            System.out.println("Key: " + key);
        }
    }
}
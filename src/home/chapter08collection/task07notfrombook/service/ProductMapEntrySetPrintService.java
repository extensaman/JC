package home.chapter08collection.task07notfrombook.service;

import home.chapter08collection.task07notfrombook.model.Product;

import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class ProductMapEntrySetPrintService implements Consumer<Map<String, Product>> {

    @Override
    public void accept(Map<String, Product> stringProductMap) {

        System.out.println("Печатаем пары (ключ-значение)...");
        Set<Map.Entry<String, Product>> entrySet = stringProductMap.entrySet();

        for (Map.Entry<String, Product> entry : entrySet) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}

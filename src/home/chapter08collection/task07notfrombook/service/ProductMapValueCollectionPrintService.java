package home.chapter08collection.task07notfrombook.service;

import home.chapter08collection.task07notfrombook.model.Product;

import java.util.Collection;
import java.util.Map;
import java.util.function.Consumer;

public class ProductMapValueCollectionPrintService implements Consumer<Map<String, Product>> {

    @Override
    public void accept(Map<String, Product> stringProductMap) {

        System.out.println("Печатаем значения...");
        Collection<Product> valueList = stringProductMap.values();

        for (Product value : valueList) {
            System.out.println("Value: " + value);
        }
    }
}

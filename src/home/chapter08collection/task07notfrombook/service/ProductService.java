package home.chapter08collection.task07notfrombook.service;

import home.chapter08collection.task07notfrombook.model.Product;

import java.util.Map;
import java.util.function.Consumer;

public class ProductService implements ProductServiceBehavior{
    @Override
    public void addProductToMap(Map<String, Product> map, String key, Product product) {
        map.put(key, product);
    }

    @Override
    public void printMap(Map<String, Product> map, Consumer<Map<String, Product>> consumer) {
        consumer.accept(map);
    }
}

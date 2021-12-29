package home.chapter08collection.task07notfrombook.service;

import home.chapter08collection.task07notfrombook.model.Product;

import java.util.Map;
import java.util.function.Consumer;

public interface ProductServiceBehavior {

    public abstract void addProductToMap (Map<String, Product> map, String key, Product product);
    public abstract void printMap (Map<String, Product> map, Consumer<Map<String, Product>> consumer);

}

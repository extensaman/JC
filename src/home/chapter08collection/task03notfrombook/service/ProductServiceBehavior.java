package home.chapter08collection.task03notfrombook.service;

import home.chapter08collection.task03notfrombook.model.Product;

import java.util.Map;

public interface ProductServiceBehavior {

    abstract public Product getProduct(double size, double price);
    abstract public void putProductToMap(Map<String, Product> map, String key, Product product);
    abstract public void printEntry (Map<String, Product> map);
    abstract public void printKeys (Map<String, Product> map);
    abstract public void printValues (Map<String, Product> map);

}

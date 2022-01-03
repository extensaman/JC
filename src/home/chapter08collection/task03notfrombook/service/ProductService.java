package home.chapter08collection.task03notfrombook.service;

import home.chapter08collection.task03notfrombook.model.Product;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class ProductService implements ProductServiceBehavior {

    @Override
    public Product getProduct(double size, double price) {
        return new Product(size, price);
    }

    @Override
    public void putProductToMap(Map<String, Product> map, String key, Product product) {
        map.put(key, product);
    }

    @Override
    public void printEntry(Map<String, Product> map) {
        System.out.println("Entry print...");

        for (Map.Entry<String, Product> entry : map.entrySet()) {
            System.out.println("Key:" + entry.getKey() + " Value: " + entry.getValue());
        }
        System.out.println();
    }

    @Override
    public void printKeys(Map<String, Product> map) {
        System.out.println("Keys print...");

        for (String key : map.keySet()) {
            System.out.println("Key: " + key);
        }
        System.out.println();
    }

    @Override
    public void printValues(Map<String, Product> map) {
        System.out.println("Values print...");
        Collection<Product> productList = map.values();
        Iterator<Product> iterator = productList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Value: " + iterator.next());
        }
        System.out.println();
    }
}

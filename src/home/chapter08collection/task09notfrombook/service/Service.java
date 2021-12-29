package home.chapter08collection.task09notfrombook.service;

import home.chapter08collection.task09notfrombook.model.Catalog;
import home.chapter08collection.task09notfrombook.model.Product;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Service implements ServiceBehavior{

    @Override
    public Catalog createCatalog() {
        return new Catalog(new LinkedList<Product>());
    }

    @Override
    public Product createProduct(String name, double price, double rating) {
        return new Product(name, price, rating);
    }

    @Override
    public void addProductToCatalog(Catalog catalog, Product product) {
        catalog.getList().add(product);
    }

    @Override
    public void printCatalog(Catalog catalog, Comparator<Product> comparator) {

        Collections.sort(catalog.getList(), comparator);

        System.out.println("Печатаем каталог: ");
        for (Product product : catalog.getList()) {
            System.out.println(product);
        }
    }
}

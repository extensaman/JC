package home.chapter08collection.task09notfrombook.service;

import home.chapter08collection.task09notfrombook.model.Catalog;
import home.chapter08collection.task09notfrombook.model.Product;

import java.util.Comparator;

public interface ServiceBehavior {

    public abstract Catalog createCatalog ();
    public abstract Product createProduct (String name, double price, double rating);
    public abstract void addProductToCatalog(Catalog catalog, Product product);
    public abstract void printCatalog (Catalog catalog, Comparator<Product> comparator);
}

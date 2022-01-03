package home.chapter08collection.task09notfrombook.model;

import java.util.List;

public class Catalog {

    private List<Product> list;

    public Catalog(List<Product> list) {
        this.list = list;
    }

    public List<Product> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "list=" + list +
                '}';
    }
}

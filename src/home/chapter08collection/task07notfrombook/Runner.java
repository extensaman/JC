package home.chapter08collection.task07notfrombook;

import home.chapter08collection.task07notfrombook.model.Product;
import home.chapter08collection.task07notfrombook.service.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Раздел "Коллекции"
 * Задание №07 (не из пособия)
 *
 * Создайте HashMap, содержащий пары значений - имя игрушки и объект игрушки
 * (класс Product с произвольными полями).
 * Перебрать и распечатать пары значений - entrySet().
 * Перебрать и распечатать набор из имен продуктов - keySet().
 * Перебрать и распечатать значения продуктов - values().
 * Для каждого перебора создать свой метод.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static void main(String[] args) {

        Map<String, Product> map = new HashMap<>();

        ProductServiceBehavior behavior = new ProductService();
        behavior.addProductToMap(map, "train", new Product("Vehicle", 100.91));
        behavior.addProductToMap(map, "castle", new Product("Lego", 10.91));
        behavior.addProductToMap(map, "ninjago", new Product("Lego", 1.27));
        behavior.addProductToMap(map, "duplo", new Product("Lego", 90.41));
        behavior.addProductToMap(map, "plane", new Product("Vehicle", 19.91));
        behavior.addProductToMap(map, "truck", new Product("Vehicle", 30.78));

        behavior.printMap(map, new ProductMapEntrySetPrintService());
        behavior.printMap(map, new ProductMapKeySetPrintService());
        behavior.printMap(map, new ProductMapValueCollectionPrintService());
    }
}

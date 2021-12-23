package home.chapter08collection.task03notfrombook;

import home.chapter08collection.task03notfrombook.model.Product;
import home.chapter08collection.task03notfrombook.service.ProductService;
import home.chapter08collection.task03notfrombook.service.ProductServiceBehavior;

import java.util.HashMap;
import java.util.Map;

/**
 * Раздел "Коллекции"
 * Задание №03 (не из пособия)
 *
 * Создайте HashMap, содержащий пары значений - имя игрушки и
 * объект игрушки (класс Product, содержащий размер игрушки и цену).
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

        ProductServiceBehavior service = new ProductService();

        Product product01 = service.getProduct(12.5, 54.92);
        service.putProductToMap(map,"One", product01);

        Product product02 = service.getProduct(22.5, 64.92);
        service.putProductToMap(map,"Two", product02);

        Product product03 = service.getProduct(32.5, 74.92);
        service.putProductToMap(map,"Three", product03);

        Product product04 = service.getProduct(42.5, 84.92);
        service.putProductToMap(map,"Four", product04);

        Product product05 = service.getProduct(52.5, 94.92);
        service.putProductToMap(map,"Five", product05);

        service.printEntry(map);
        service.printKeys(map);
        service.printValues(map);
    }
}

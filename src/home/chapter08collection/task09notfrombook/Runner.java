package home.chapter08collection.task09notfrombook;

import home.chapter08collection.task09notfrombook.model.Catalog;
import home.chapter08collection.task09notfrombook.model.Product;
import home.chapter08collection.task09notfrombook.service.Service;
import home.chapter08collection.task09notfrombook.service.ServiceBehavior;
import home.chapter08collection.task09notfrombook.view.View;

/**
 * Раздел "Коллекции"
 * Задание №09 (не из пособия)
 *
 * Вместо массивов используйте коллекции. Создать метод, распечатывающий товары каталога,
 * отсортированные по имени, цене или рейтингу.
 * Добавить возможность сортировать в обратном порядке. (Творческое задание, как поняли так и делайте)
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static void main(String[] args) {

        ServiceBehavior behavior = new Service();
        Catalog catalog = behavior.createCatalog();

        Product product01 = behavior.createProduct("МолокоБрестЛитовск", 1.85, 9.5);
        behavior.addProductToCatalog(catalog, product01);

        Product product02 = behavior.createProduct("Капуста", 0.91, 7.5);
        behavior.addProductToCatalog(catalog, product02);

        Product product03 = behavior.createProduct("ПивоХейнекен", 2.25, 7.7);
        behavior.addProductToCatalog(catalog, product03);

        Product product04 = behavior.createProduct("ПельмениБабушкаАня", 3.45, 8.2);
        behavior.addProductToCatalog(catalog, product04);

        Product product05 = behavior.createProduct("БатонМолочный", 1.15, 6.2);
        behavior.addProductToCatalog(catalog, product05);

        Product product06 = behavior.createProduct("Банан", 2.99, 7.9);
        behavior.addProductToCatalog(catalog, product06);

        Product product07 = behavior.createProduct("Шпроты", 3.67, 4.3);
        behavior.addProductToCatalog(catalog, product07);

        Product product08 = behavior.createProduct("Сметана", 2.05, 8.1);
        behavior.addProductToCatalog(catalog, product08);

        Product product09 = behavior.createProduct("Горчица", 2.01, 8.9);
        behavior.addProductToCatalog(catalog, product09);

        Product product10 = behavior.createProduct("Суши", 18.85, 6.25);
        behavior.addProductToCatalog(catalog, product10);

        behavior.printCatalog(catalog, null);

        while (true) {
            View.printMenu();
            int choice = View.inputInt();
            switch (choice) {
                case 1: behavior.printCatalog(catalog, (p1, p2) -> p1.getName().compareTo(p2.getName()));
                break;
                case 2: behavior.printCatalog(catalog, (p1, p2) -> p2.getName().compareTo(p1.getName()));
                break;
                case 3: behavior.printCatalog(catalog, (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
                break;
                case 4: behavior.printCatalog(catalog, (p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
                break;
                case 5: behavior.printCatalog(catalog, (p1, p2) -> Double.compare(p1.getRating(), p2.getRating()));
                break;
                case 6: behavior.printCatalog(catalog, (p1, p2) -> Double.compare(p2.getRating(), p1.getRating()));
                break;
                case 0: System.exit(0);
                break;
            }
        }

    }
}

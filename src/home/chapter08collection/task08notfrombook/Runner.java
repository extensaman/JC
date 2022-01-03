package home.chapter08collection.task08notfrombook;

import com.sun.source.tree.Tree;
import home.chapter08collection.task08notfrombook.model.HeavyBox;
import home.chapter08collection.task08notfrombook.service.HeavyBoxService;
import home.chapter08collection.task08notfrombook.service.HeavyBoxServiceBehavior;

import java.util.Set;
import java.util.TreeSet;

/**
 * Раздел "Коллекции"
 * Задание №08 (не из пособия)
 *
 * Создать TreeSet содержащий HeavyBox (вес, размер).
 * HeavyBox должен реализовать интерфейс Comparable(сортировка по весу,
 * если вес одинаковый то по размеру).
 * Распечатать содержимое с помощью for each.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static void main(String[] args) {

        Set<HeavyBox> set = new TreeSet<>();

        HeavyBoxServiceBehavior behavior = new HeavyBoxService();

        HeavyBox box00 = behavior.getHeavyBox(10.2,90.68);
        behavior.addHeavyBoxToSet(set, box00);

        HeavyBox box01 = behavior.getHeavyBox(10.5,9.67);
        behavior.addHeavyBoxToSet(set, box01);

        HeavyBox box02 = behavior.getHeavyBox(15.5,110.47);
        behavior.addHeavyBoxToSet(set, box02);

        HeavyBox box03 = behavior.getHeavyBox(10.2,130.68);
        behavior.addHeavyBoxToSet(set, box03);

        HeavyBox box04 = behavior.getHeavyBox(10.2,120.68);
        behavior.addHeavyBoxToSet(set, box04);

        HeavyBox box05 = behavior.getHeavyBox(10.2,110.68);
        behavior.addHeavyBoxToSet(set, box05);

        HeavyBox box06 = behavior.getHeavyBox(10.2,90.68);
        behavior.addHeavyBoxToSet(set, box06);

        HeavyBox box07 = behavior.getHeavyBox(0.8,0.27);
        behavior.addHeavyBoxToSet(set, box07);

        behavior.printHeavyBoxSet(set);
    }
}

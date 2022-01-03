package home.chapter08collection.task02notfrombook.service;

import home.chapter08collection.task02notfrombook.model.HeavyBox;

import java.util.List;

public class HeavyBoxService implements HeavyBoxServiceBehavior{

    @Override
    public HeavyBox getHeavyBox(double size, double weight) {
        return new HeavyBox(size, weight);
    }

    @Override
    public void addHeavyBoxToList(List<HeavyBox> list, HeavyBox box) {
        list.add(box);
    }

    @Override
    public void printHeavyBoxList(List<HeavyBox> list) {

        System.out.println("List is ...");
        for (HeavyBox box : list) {
            System.out.println(box);
        }
        System.out.println();
    }

    @Override
    public void changeFirstElementWeight(List<HeavyBox> list, double delta) {
        try {
            HeavyBox box = list.get(0);
            list.set(0, new HeavyBox(box.getSize(), box.getWeight() + delta));
        } catch (IndexOutOfBoundsException e) // если LIst пустой
        {
            System.err.println("Исключение в методе void changeFirstElementWeight(List<HeavyBox> list, double delta) " + e);
        }
    }

    @Override
    public HeavyBox deleteLastListElement(List<HeavyBox> list) {
        try {
            return list.remove(list.size() - 1);
        } catch (IndexOutOfBoundsException e) // если LIst пустой
        {
            System.err.println("Исключение в методе HeavyBox deleteLastListElement(List<HeavyBox> list) " + e);
            return null;
        }

    }

    @Override
    public void clearList(List<HeavyBox> list) {
        list.clear();
    }

    @Override
    public void printHeavyBoxArray(ArrayMakingBehavior behavior, List<HeavyBox> list) {

        System.out.println("Array is ...");

        for (HeavyBox box : behavior.getArray(list)) {
               System.out.println(box);
        }
        System.out.println();
    }
}

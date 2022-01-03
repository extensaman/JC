package home.chapter08collection.task08notfrombook.service;

import home.chapter08collection.task08notfrombook.model.HeavyBox;

import java.util.Set;

public class HeavyBoxService implements HeavyBoxServiceBehavior{

    @Override
    public HeavyBox getHeavyBox(double weight, double size) {
        return new HeavyBox(weight, size);
    }

    @Override
    public void addHeavyBoxToSet(Set<HeavyBox> set, HeavyBox box) {
        set.add(box);
    }

    @Override
    public void printHeavyBoxSet(Set<HeavyBox> set) {

        System.out.println("Отсортированный set: ");
        for (HeavyBox box : set) {
            System.out.println(box);
        }
    }
}

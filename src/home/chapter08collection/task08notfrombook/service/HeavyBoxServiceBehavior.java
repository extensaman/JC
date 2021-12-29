package home.chapter08collection.task08notfrombook.service;

import home.chapter08collection.task08notfrombook.model.HeavyBox;

import java.util.Set;

public interface HeavyBoxServiceBehavior {

    public abstract HeavyBox getHeavyBox(double weight, double size);
    public abstract void addHeavyBoxToSet (Set<HeavyBox> set, HeavyBox box);
    public abstract void printHeavyBoxSet(Set<HeavyBox> set);
}

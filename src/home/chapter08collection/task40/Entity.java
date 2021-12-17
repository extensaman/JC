package home.chapter08collection.task40;

import java.util.List;

public class Entity {

    private List<Integer> integerList;

    public Entity(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "integerList=" + integerList +
                '}';
    }
}

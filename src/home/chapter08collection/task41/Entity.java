package home.chapter08collection.task41;

import java.util.ArrayList;
import java.util.List;

public class Entity {

    private List<Integer> list;

    public Entity () {
        list = new ArrayList<>();
    }

    public Entity(List<Integer> list) {

        this.list = list;
    }

    public List<Integer> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "list = " + ((list == null) ? null : list.toString());
    }

    @Override
    public boolean equals (Object o) {

        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Entity obj = (Entity) o;
        if (this.list == null) {
            return obj.list == null;
        }

        return obj.list != null && this.list.equals(obj.list);
    }

    @Override

    public int hashCode() {
        if (this.list == null) {
            return 0;
        } else {
            return list.hashCode();
        }
    }
}

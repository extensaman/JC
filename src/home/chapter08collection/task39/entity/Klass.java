package home.chapter08collection.task39.entity;

import java.util.List;

public class Klass {

    private List<Pupil> klass;

    public Klass(List<Pupil> klass) {
        this.klass = klass;
    }

    public List<Pupil> getList() {
        return klass;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Класс состоит из\n");
        klass.stream().forEach(x -> stringBuffer.append(x));
        return stringBuffer.toString();
    }
}

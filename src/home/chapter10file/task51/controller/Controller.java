package home.chapter10file.task51.controller;

import home.chapter10file.task51.entity.Person;
import home.chapter10file.task51.reader.MyReader;
import home.chapter10file.task51.service.Service;
import home.chapter10file.task51.view.View;
import home.chapter10file.task51.writer.MyWriter;

import java.io.File;
import java.util.Set;
import java.util.TreeSet;

public class Controller {

    public void perform (int personCount, String filePath, int surnameLength, int nameLength, int lowAgeLimit, int highAgeLimit) {

        Service service = new Service();

        Set<Person> set = new TreeSet<>();

        while (set.size() < personCount) {
            set.add(service.createRandomPerson(surnameLength, nameLength, lowAgeLimit, highAgeLimit));
        }

        File file = service.createFile(filePath);

        MyWriter writer = new MyWriter<Person>();

        writer.writeObjectSet(set,file);

        View.printSet(set);
        set.clear();

        MyReader reader = new MyReader();
        set = reader.readObjectSet(file);

        View.printSet(set);
    }
}

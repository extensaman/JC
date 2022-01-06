package home.chapter12stream.task62.controller;

import home.chapter12stream.task62.entity.Person;
import home.chapter12stream.task62.service.Service;
import home.chapter12stream.task62.view.View;


import java.util.HashSet;
import java.util.Set;

public class Controller {

    public void perform (int personCount, int surnameLength, int nameLength, int lowAgeLimit, int highAgeLimit) {

        Service service = new Service();

        Set<Person> set = new HashSet<>();

        int addedCount = 0;
        while (addedCount < personCount) {
            System.out.println(addedCount);
            if (set.add(service.createRandomPerson(surnameLength, nameLength, lowAgeLimit, highAgeLimit))) {
                addedCount++;
            };
        }

        View.printSet(set);

    }
}

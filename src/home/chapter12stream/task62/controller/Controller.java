package home.chapter12stream.task62.controller;

import home.chapter12stream.task62.entity.Person;
import home.chapter12stream.task62.service.Service;
import home.chapter12stream.task62.view.View;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    public void perform (int personCount,
                         int surnameLength,
                         int nameLength,
                         int lowAgeLimit,
                         int highAgeLimit,
                         int ageLimitForStream,
                         int personCountLimitForStream) {

        Set<Person> initialSet = service.generatePersonSet (personCount, surnameLength, nameLength, lowAgeLimit, highAgeLimit);

        View.printCollection(initialSet);

        List<String> resultList =
                initialSet.
                        stream().
                        filter(x -> x.getAge() < ageLimitForStream).
                        peek(System.out::println).
                        sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName)).
                        limit(personCountLimitForStream).
                        map(Person::getSurname).collect(Collectors.toList());

        View.printCollection(resultList);

    }


}

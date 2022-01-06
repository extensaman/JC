package home.chapter12stream.task62.service;

import home.chapter12stream.task62.entity.Person;

import java.util.Random;

public class Service {

    public static final String PREFFIX = "абвгдежзиклмнопрстуфхцчшщэюя";
    public static final String SURNAME_POSTFIX = "ов";

    public Person createRandomPerson (int surnameLength, int nameLength, int lowAgeLimit, int highAgeLimit) {

        Random random = new Random();

        return new Person(generateRandomString(surnameLength) + SURNAME_POSTFIX,
                generateRandomString(nameLength),
                random.nextInt(highAgeLimit - lowAgeLimit) + lowAgeLimit);
    }

    public String generateRandomString (int length) {
        char[] array = new char[length];

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = PREFFIX.charAt(random.nextInt(PREFFIX.length()));
        }
        if (length > 0) {
            array[0] = Character.toUpperCase(array[0]);
        }

        return new String(array);
    }
}

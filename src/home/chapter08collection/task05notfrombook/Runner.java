package home.chapter08collection.task05notfrombook;

import home.chapter08collection.task05notfrombook.model.Pet;
import home.chapter08collection.task05notfrombook.model.PetTypes;
import home.chapter08collection.task05notfrombook.service.PetService;
import home.chapter08collection.task05notfrombook.service.PetServiceBehavior;

import java.util.HashMap;
import java.util.Map;

/**
 * Раздел "Коллекции"
 * Задание №05 (не из пособия)
 *
 * Создайте класс Pet и его наследников Cat, Dog, Parrot.
 * Создайте отображение из домашних животных, где в качестве ключа выступает имя животного,
 * а в качестве значения класс Pet.
 * Добавьте в отображение разных животных.
 * Создайте метод выводящий на консоль все ключи отображения.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static void main(String[] args) {

        PetServiceBehavior serviceBehavior = new PetService();
        Map<String, Pet> map = new HashMap<>();

        // Dogs
        Pet pet01 = serviceBehavior.createPet("Иванов И.И.", "Овчарка", PetTypes.DOG);
        serviceBehavior.addPetToMap(map, "Палкан-Иванова", pet01);

        Pet pet02 = serviceBehavior.createPet("Иванов И.И.", "Овчарка", PetTypes.DOG);
        serviceBehavior.addPetToMap(map, "Дружок-Иванова", pet02);

        Pet pet03 = serviceBehavior.createPet("Петров П.П.", "Йорк", PetTypes.DOG);
        serviceBehavior.addPetToMap(map, "Пупсик", pet03);

        Pet pet04 = serviceBehavior.createPet("Сидоров С.С.", "Колли", PetTypes.DOG);
        serviceBehavior.addPetToMap(map, "Лада", pet04);

        Pet pet05 = serviceBehavior.createPet("Вязов А.А.", "Бульдог", PetTypes.DOG);
        serviceBehavior.addPetToMap(map, "Хрюня", pet05);

        Pet pet06 = serviceBehavior.createPet("Лапшина А.Ю.", "Доберман", PetTypes.DOG);
        serviceBehavior.addPetToMap(map, "Соня", pet06);

        // Cats
        Pet pet07 = serviceBehavior.createPet("Винокурова У.С.", "Белый", PetTypes.CAT);
        serviceBehavior.addPetToMap(map, "Мурзик", pet07);

        Pet pet08 = serviceBehavior.createPet("Иванов И.И.", "Черный", PetTypes.CAT);
        serviceBehavior.addPetToMap(map, "Ласа", pet08);

        Pet pet09 = serviceBehavior.createPet("Помидоров П.П.", "Пегий", PetTypes.CAT);
        serviceBehavior.addPetToMap(map, "Бегемот", pet09);

        // Parrots
        Pet pet10 = serviceBehavior.createPet("Белых С.В.", "Бангладеш", PetTypes.PARROT);
        serviceBehavior.addPetToMap(map, "Кака", pet10);

        Pet pet11 = serviceBehavior.createPet("Иванов И.И.", "Лаос", PetTypes.PARROT);
        serviceBehavior.addPetToMap(map, "Попка", pet11);

        Pet pet12 = serviceBehavior.createPet("Краюхина Н.В.", "Колумбия", PetTypes.PARROT);
        serviceBehavior.addPetToMap(map, "Каркуша", pet12);

        serviceBehavior.printMapKeys(map);
        serviceBehavior.printMapValues(map);
        serviceBehavior.printAllMap(map);

    }
}

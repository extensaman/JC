package home.chapter08collection.task05notfrombook.service;

import home.chapter08collection.task05notfrombook.model.*;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PetService implements PetServiceBehavior{

    @Override
    public Pet createPet(String owner, String feature, PetTypes type) {
        switch (type) {
            case DOG:
                return new Dog(owner, feature);
                case CAT:
                return new Cat(owner, feature);
            case PARROT:
                return new Parrot(owner, feature);
            default:
                return null;
        }
    }

    @Override
    public Pet addPetToMap(Map<String, Pet> map, String name, Pet pet) {
        return map.put(name, pet);
    }

    @Override
    public void printMapKeys(Map<String, Pet> map) {
        System.out.println("Keys are...");
        for (String name : map.keySet()) {
            System.out.println("Key = " + name);
        }
        System.out.println();
    }

    @Override
    public void printMapValues(Map<String, Pet> map) {
        System.out.println("Values are...");
        for (Pet pet : map.values()) {
            System.out.println("Value =" + pet);
        }
        System.out.println();
    }

    @Override
    public void printAllMap(Map<String, Pet> map) {
        System.out.println("Entries are...");
        Set<Map.Entry<String, Pet>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Pet>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Pet> petEntry = iterator.next();
            System.out.println("Key = " + petEntry.getKey() + "\nValue = " + petEntry.getValue() + '\n');
        }
    }
}

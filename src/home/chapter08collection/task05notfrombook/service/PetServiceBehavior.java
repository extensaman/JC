package home.chapter08collection.task05notfrombook.service;

import home.chapter08collection.task05notfrombook.model.Pet;
import home.chapter08collection.task05notfrombook.model.PetTypes;

import java.util.Map;

public interface PetServiceBehavior {

    abstract public Pet createPet (String owner, String feature, PetTypes type);
    abstract public Pet addPetToMap (Map<String, Pet> map, String name, Pet pet);
    abstract public void printMapKeys (Map<String, Pet> map);
    abstract public void printMapValues (Map<String, Pet> map);
    abstract public void printAllMap (Map<String, Pet> map);
}

package home.chapter10file.task51.entity;

import java.io.Serializable;
import java.util.Objects;

public final class Person implements Serializable, Comparable<Person> {

    private final String surname;
    private final String name;
    private final int age;

    public Person() {
        surname = name = "Unknown";
        age = 0;
    }
    public Person(String surname, String name, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (this.getClass() != o.getClass() || o == null) {
            return false;
        }

        Person obj = (Person) o;

        return Objects.equals(this.surname, obj.surname) &&
                Objects.equals(this.name, obj.name) && this.age == obj.age;
    }

    @Override
    public int hashCode() {
        return 31 * age + surname.hashCode() + name.hashCode();
    }

    @Override
    public int compareTo(Person obj) {
        if (this == obj) {
            return 0;
        }

        if (obj == null) {
            throw new IllegalArgumentException();
        }

        return this.age - obj.age;
    }

    @Override
    public String toString() {
        return "Person >> surname: " + surname + ", name: " + name + ", age = " + age;
    }
}

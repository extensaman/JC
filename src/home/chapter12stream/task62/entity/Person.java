package home.chapter12stream.task62.entity;

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

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
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

        int ageDelta = this.age - obj.age;

        if (ageDelta == 0) {

            int surnameDelta = this.surname.compareTo(obj.surname);

            if (surnameDelta == 0) {

                int nameDelta = this.name.compareTo(obj.name);

                if (nameDelta == 0) {

                    return 0;
                }
                else {
                    return nameDelta;
                }

            } else {

                return surnameDelta;
            }

        } else {

            return ageDelta;
        }
    }

    @Override
    public String toString() {
        return "Person >> surname: " + surname + ", name: " + name + ", age = " + age;
    }
}

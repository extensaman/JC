package home.chapter15reflectionandannotation.task70.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.concurrent.Callable;

public class Man implements Comparable<Object> {

    private final String surname;
    private final String name;
    private final LocalDate birthday;

    public Man(String surname, String name, LocalDate birthday) {
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Man obj = (Man) o;

        return Objects.equals(this.surname, obj.surname) &&
                Objects.equals(this.name, obj.name) &&
                Objects.equals(this.birthday, obj.birthday);
    }

    @Override
    public int hashCode() {
        return 31 * surname.hashCode() + name.hashCode() + birthday.hashCode();
    }
    @Override
    public String toString() {
        return "Suranme: " + surname +
                ", Name: " + name +
                ", birthday: " + birthday.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    @Override
    public int compareTo(Object o) {
        Man another = (Man) o;
        if (another == null) {
            throw new IllegalArgumentException();
        }
        int result = this.surname.compareTo(another.surname);
        if (result == 0) {
            result = this.name.compareTo(another.name);
            if (result == 0) {
                return this.birthday.compareTo(another.birthday);
            }
        }
        return result;
    }

}

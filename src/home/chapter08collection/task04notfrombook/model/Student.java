package home.chapter08collection.task04notfrombook.model;

// класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.

import java.util.Arrays;
import java.util.Objects;

public final class Student {

    private String FIO;
    private String group;
    private int course;
    private int[] marks;

    public Student(String FIO, String group, int course, int[] marks) {
        this.FIO = FIO;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "FIO='" + FIO + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }

    public String getFIO() {
        return FIO;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(FIO, student.FIO) &&
                Objects.equals(group, student.group) &&
                Arrays.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(FIO, group, course);
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }
}

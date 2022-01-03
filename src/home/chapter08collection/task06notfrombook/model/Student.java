package home.chapter08collection.task06notfrombook.model;

import java.util.List;
import java.util.Objects;

// Bean
// Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
public final class Student implements Comparable<Student>{

    private final String FIO;
    private final String group;
    private final Courses course;
    private final List<Integer> marks;

    public Student(String FIO, String group, Courses course, List<Integer> marks) {
        this.FIO = FIO;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    @Override
    public boolean equals (Object o){

        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Student obj = (Student) o;

        return Objects.equals(this.FIO, obj.FIO) &&
                Objects.equals(this.group, obj.group) &&
                this.course == obj.course &&
                Objects.equals(this.marks, obj.marks);
    }

    @Override
    public int hashCode() {
        return 31 * (FIO.hashCode() + group.hashCode() + course.ordinal() + marks.hashCode());
    }

    @Override
    public int compareTo (Student another) throws IllegalArgumentException{

        if (another == null) {
            throw new IllegalArgumentException("Нулевая ссылка переадана в метод compareTo");
        }

        int temp = this.group.compareTo(another.group);
        if (temp == 0) {
            double thisAverageMark = this.marks.stream().mapToInt(a -> a).sum() / (double) this.marks.size();
            double anotherAverageMark = another.marks.stream().mapToInt(a -> a).sum() / (double) another.marks.size();

            if (thisAverageMark > anotherAverageMark) {
                return 1;
            } else {
                if (thisAverageMark == anotherAverageMark) {
                    return 0;
                } else {
                    return -1;
                }
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("\nStudent:\n");
        builder.append("ФИО: ").append(FIO).append('\n');
        builder.append("Группа: ").append(group).append('\n');
        builder.append("Курс: ").append(course.getValue()).append('\n');
        builder.append("Оценки: ").append(marks).append('\n');
        return builder.toString();
    }
}

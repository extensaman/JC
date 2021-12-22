package home.chapter08collection.task04notfrombook.service;

import home.chapter08collection.task04notfrombook.model.Student;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class StudentsService implements StudentServiceBehavior{

    @Override
    public Student createStudent(String FIO, String group, int course, int[] masrks) {
        return new Student(FIO, group, course, masrks);
    }

    @Override
    public Set<Student> createStudentsSet(Student... array) {
        return new HashSet<Student>(Arrays.asList(array));
    }

    @Override
    public int expulsionOfStudents(Set<Student> set, double marksLowLimit) {
        int inititalSetSize = set.size();
        set.removeIf(s -> IntStream.of(s.getMarks()).sum() / (double) s.getMarks().length < marksLowLimit);
        return inititalSetSize - set.size();
    }

    @Override
    public void promoteStudentsNextCourse(Set<Student> set, double marksLowLimit) {

        set.stream().filter(s -> IntStream.of(s.getMarks()).sum() / (double) s.getMarks().length >= marksLowLimit)
                .forEach(s -> s.setCourse(s.getCourse() + 1));
    }

    @Override
    public void printStudentsInCourse(Set<Student> set, int course) {
        System.out.println("Students of " + course + " course are");
        for (Student student : set) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    @Override
    public void prinAllStudents(Set<Student> set) {
        System.out.println("All students are");
        set.stream().forEach(System.out::println);
    }
}

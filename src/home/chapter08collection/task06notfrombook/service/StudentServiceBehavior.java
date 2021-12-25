package home.chapter08collection.task06notfrombook.service;

import home.chapter08collection.task06notfrombook.model.Courses;
import home.chapter08collection.task06notfrombook.model.Student;

import java.util.List;
import java.util.Set;

public interface StudentServiceBehavior {

    void addStudent (Set<Student> set, String FIO, String group, Courses course, List<Integer> marks);
    void printStudentSet (Set<Student> set);
}

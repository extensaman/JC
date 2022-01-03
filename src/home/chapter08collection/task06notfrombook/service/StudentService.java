package home.chapter08collection.task06notfrombook.service;

import home.chapter08collection.task06notfrombook.model.Courses;
import home.chapter08collection.task06notfrombook.model.Student;

import java.util.List;
import java.util.Set;

public class StudentService implements StudentServiceBehavior{

    @Override
    public void addStudent (Set<Student> set, String FIO, String group, Courses course, List<Integer> marks) {
        set.add(new Student(FIO, group, course, marks));
    }

    @Override
    public void printStudentSet(Set<Student> set) {
        System.out.println("Sudents sorted set is ...");
        for (Student student : set) {
            System.out.println(student);
        }
    }
}

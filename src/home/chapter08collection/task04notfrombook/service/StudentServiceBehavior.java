package home.chapter08collection.task04notfrombook.service;

import home.chapter08collection.task04notfrombook.model.Student;

import java.util.Set;

public interface StudentServiceBehavior {

    abstract public Student createStudent(String FIO, String group, int course, int[] masrks);
    abstract public Set<Student> createStudentsSet (Student ... array);
    abstract public int expulsionOfStudents (Set<Student> set, double marksLowLimit);
    abstract public void promoteStudentsNextCourse (Set<Student> set, double marksLowLimit);
    abstract public void printStudentsInCourse(Set<Student> set, int course);
    abstract public void prinAllStudents (Set<Student> set);
}


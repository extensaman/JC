package home.chapter08collection.task04notfrombook;

import home.chapter08collection.task04notfrombook.model.Student;
import home.chapter08collection.task04notfrombook.service.StudentsService;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Раздел "Коллекции"
 * Задание №04 (не из пособия)
 *
 * Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
 * Создать коллекцию, содержащую объекты класса Student.
 * Написать метод, который удаляет студентов со средним баллом <3. Если средний балл>=3,
 * студент переводится на следующий курс.
 * Напишите метод printStudents(List<Student> students, int course),
 * который получает список студентов и номер курса.
 * А также печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final double MARKS_LIMIT = 3.0;
    public static final int COURSE_FOR_PRINT = 4;

    public static void main(String[] args) {

        StudentsService service = new StudentsService();

        Student student01 = service.createStudent("Ануфриева Е.В.", "322", 3, new int[]{5,2,7,8,9,2,6});
        Student student02 = service.createStudent("Ньтонов к.В.", "321", 2, new int[]{7,10,9,10,8,9,7});
        Student student03 = service.createStudent("Карамзин А.В.", "321", 1, new int[]{5,5,2,3,4,8,10,2,4});
        Student student04 = service.createStudent("Перов А.А.", "322", 3, new int[]{2,2,3,2,3,2,3,4});
        Student student05 = service.createStudent("Картошкин В.С.", "321", 2, new int[]{7,4,3,2,8,9,10,6,9});
        Student student06 = service.createStudent("Сильвановин В.Н.", "322", 2, new int[]{2,3,2,3,2,2,2,2,2,2,3});

        Set<Student> set = service.createStudentsSet(student01,student02,student03,student04,student05,student06);
        service.prinAllStudents(set);

        service.expulsionOfStudents(set, MARKS_LIMIT);
        service.prinAllStudents(set);

        service.promoteStudentsNextCourse(set, MARKS_LIMIT);
        service.prinAllStudents(set);

        service.printStudentsInCourse(set, COURSE_FOR_PRINT);;
    }

}

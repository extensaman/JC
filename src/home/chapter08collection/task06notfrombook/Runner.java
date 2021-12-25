package home.chapter08collection.task06notfrombook;

import home.chapter08collection.task06notfrombook.model.Courses;
import home.chapter08collection.task06notfrombook.model.Student;
import home.chapter08collection.task06notfrombook.service.StudentService;
import home.chapter08collection.task06notfrombook.service.StudentServiceBehavior;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Раздел "Коллекции"
 * Задание №06 (не из пособия)
 *
 * Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
 * Сгенерировать 10 студентов, отсортировать студентов по группе, если группы однинаковые то по оценкам.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static void main(String[] args) {

        Set<Student> set = new TreeSet<>();

        StudentServiceBehavior behavior = new StudentService();

        behavior.addStudent(set, "Петров П.И.", "050501", Courses.FIFTH,
                Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        behavior.addStudent(set, "Кривошеев В.И.", "050502", Courses.FIRST,
                Arrays.asList(1,2,3,4,5,6,7,8,9,9));
        behavior.addStudent(set, "Крутин А.И.", "050503", Courses.THIRD,
                Arrays.asList(1,2,3,4,5,6,7,8,9,8));
        behavior.addStudent(set, "Латышев М.И.", "050501", Courses.FOURTH,
                Arrays.asList(1,2,3,4,5,6,7,8,9,7));
        behavior.addStudent(set, "Гномов Ю.А.", "050502", Courses.FIRST,
                Arrays.asList(1,2,3,4,5,6,7,8,9,6));
        behavior.addStudent(set, "Карелин С.С.", "050503", Courses.SECOND,
                Arrays.asList(1,2,3,4,5,6,7,8,9,5));
        behavior.addStudent(set, "Ветров П.И.", "050501", Courses.FIRST,
                Arrays.asList(1,2,3,4,5,6,7,8,9,4));
        behavior.addStudent(set, "Раскольников Р.Р.", "050502", Courses.FIFTH,
                Arrays.asList(1,2,3,4,5,6,7,8,9,3));
        behavior.addStudent(set, "Лермонтов В.М.", "050503", Courses.THIRD,
                Arrays.asList(1,2,3,4,5,6,7,8,9,2));
        behavior.addStudent(set, "Капустин Э.И.", "050501", Courses.SECOND,
                Arrays.asList(1,2,3,4,5,6,7,8,9,1));

        behavior.printStudentSet(set);
    }
}

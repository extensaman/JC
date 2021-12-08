package home.chapter08collection.task39.entity;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Pupil implements Comparable<Pupil>{

    private String fio;
    private List<Integer> marks;

    public Pupil(String fio, List<Integer> marks) {
        this.fio = fio;
        this.marks = marks;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    @Override
    public String toString () {
        return "ФИО: " + fio + '\n' + "Оценки" + marks.toString() + '\n';
    }

    @Override
    public int compareTo (Pupil o) {

        if (this == o) {
            return 0;
        }
        Iterator<Integer> pupilIterator = this.marks.iterator();
        int marksSum1 = 0;
        while (pupilIterator.hasNext()) {
            marksSum1 += pupilIterator.next();
        }
        pupilIterator = o.marks.iterator();
        int marksSum2 = 0;
        while (pupilIterator.hasNext()) {
            marksSum2 += pupilIterator.next();
        }

        double averageMark1 = (double)marksSum1 / this.marks.size();
        double averageMark2 = (double)marksSum2 / o.marks.size();

        if (averageMark1 - averageMark2 == 0) {
            return 0;
        } else if (averageMark1 - averageMark2 > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}

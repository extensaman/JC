package home.chapter08collection.task39.logic;

import home.chapter08collection.task39.entity.Klass;
import home.chapter08collection.task39.misc.FIO;
import home.chapter08collection.task39.misc.MagicNumbers;
import home.chapter08collection.task39.entity.Pupil;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Controller implements DeleteBadPupilMarks,
                                    GeneratePupilMarks,
                                    CreatePupilsList,
                                    DeleteBadPupilsMarksInKlass,
                                    SortKlassByAverageMark {

    @Override
    public void deleteBadPupilMarks(List<Integer> marks, int lowLimit) {

        Predicate<Integer> predicate = a -> a < lowLimit;
        marks.removeIf(predicate);

    }

    @Override
    public List<Integer> generatePupilMarks(int size) {

        List<Integer> marks = new ArrayList<Integer>(size);

        for (int i = 0; i < size; i++) {
            marks.add((int) (Math.random() * MagicNumbers.MAXIMUM_MARK.getValue()) + 1);
        }

        return marks;

    }

    @Override
    public List<Pupil> createPupilsList() {

        FIO[] fios = FIO.values();

        if (fios.length == 0) {
            return null;
        }

        List<Pupil> klass = new ArrayList<>(fios.length);
        for (int i = 0; i < fios.length; i++) {
            Pupil pupil = new Pupil (fios[i].getFio(),
                    this.generatePupilMarks(MagicNumbers.MARKS_COUNT.getValue()));
            klass.add(pupil);
        }
        return klass;
    }

    @Override
    public void deleteBadPupilsMarksInKlass(Klass klass, int lowLimit) {
        klass.getList().stream().forEach( pupil -> deleteBadPupilMarks(pupil.getMarks(), lowLimit));
    }

    @Override
    public void sortKlassByAverageMark(Klass klass) {
        klass.getList().sort(null);
    }
}

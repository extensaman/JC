package home.chapter06inheritance.task01;

public class Logic {

    public static final int FULL_TIME_FOR_BEST_STUDENT = 198;

    public static StudentBehavior simpleFactory (StudentTypes studentType) {

        switch (studentType) {
            case TYPE_01:
                return new Type01Student(StudentTalant.generateTalantLevel(), FULL_TIME_FOR_BEST_STUDENT);
            case TYPE_02:
                return new Type02Student(StudentTalant.generateTalantLevel(), FULL_TIME_FOR_BEST_STUDENT);
            case TYPE_03:
                return new Type03Student(StudentTalant.generateTalantLevel(), FULL_TIME_FOR_BEST_STUDENT);
        }
        return null;
    }

    public static StudentBehavior[] formGroup (int capacity) {

        StudentBehavior[] group = new StudentBehavior[capacity];

        int subGroupsCount = capacity / StudentTypes.values().length;
        for (int i = 0; i < subGroupsCount; i++) {
            for (int j = 0; j < subGroupsCount; j++) {

                int index;
                do {
                    index = (int) (Math.random() * capacity);
                } while (group[index] != null);

                group[index] = simpleFactory(StudentTypes.values()[j]);
            }
        }

        return group;
    }

}

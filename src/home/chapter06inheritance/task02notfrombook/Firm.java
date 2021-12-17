package home.chapter06inheritance.task02notfrombook;

/**
 * Раздел "Наследование и полиморфизм. Внутренние и
 * анонимные классы"
 * Задание №02 (не из книги) - домашнее задание 14.12.2021
 *
 * Создать класс "Фирма".
 * У этого класса есть два внутрених класса.
 * Один не статический внутрений "Ответвление фирмы", другой статический внутрений класс "Отдел продаж".
 * Поля классов произвольные.
 * Создать в main экземпляры всех трех классов
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Firm {

    private String firmName;
    private int staffCount;

    private static int income = 0;

    public Firm(String firmName, int staffCount) {
        this.firmName = firmName;
        this.staffCount = staffCount;
    }

    public int calculateStaffCount (SaleDepartment saleDepartment, FirmBranch ... branches) {
            int counter = 0;
            for (FirmBranch firmBranch : branches) {
                counter += firmBranch.getStaffCount();
            }
            return staffCount + counter + saleDepartment.getStaffCount();
    }

    public static int getIncome(){
        return income;
    }

    public class FirmBranch {
        private String branchName;
        private int staffCount;

        public FirmBranch(String branchName, int staffCount) {
            this.branchName = branchName;
            this.staffCount = staffCount;
        }

        public int getStaffCount() {
            return staffCount;
        }

        public void addToFirmIncome (int money){
            income += money;
        }
    }

    public static class SaleDepartment {

        private int staffCount;

        public SaleDepartment(int staffCount) {
            this.staffCount = staffCount;
        }

        public int getStaffCount() {
            return staffCount;
        }

        public void addToFirmIncome (int money){
            income += money;
        }
    }
}

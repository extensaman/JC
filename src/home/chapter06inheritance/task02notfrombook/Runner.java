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

public class Runner {


    public static void main(String[] args) {

        Firm firm01 = new Firm("Рога и копыта", MagicNumbers.FIRM_DEFAULT_COUNT.getValue());

        Firm.FirmBranch humanResourcesBranch = firm01.new FirmBranch("Кадры", MagicNumbers.HR_COUNT.getValue());
        Firm.FirmBranch managerBranch = firm01.new FirmBranch("Руководство", MagicNumbers.MANAGER_COUNT.getValue());
        Firm.FirmBranch securityBranch = firm01.new FirmBranch("Охрана", MagicNumbers.SECURITY_COUNT.getValue());

        Firm.SaleDepartment saleDepartment = new Firm.SaleDepartment(MagicNumbers.SALE_DEPARTMENT_COUNT.getValue());

        System.out.println("Firm's staff count is " + // output: 20
                firm01.calculateStaffCount(saleDepartment, humanResourcesBranch, managerBranch, securityBranch));

        humanResourcesBranch.addToFirmIncome(MagicNumbers.HR_INCOME.getValue());
        managerBranch.addToFirmIncome(MagicNumbers.MANAGER_INCOME.getValue());
        securityBranch.addToFirmIncome(MagicNumbers.SECURITY_INCOME.getValue());

        saleDepartment.addToFirmIncome(MagicNumbers.SALE_DEPARTMENT_INCOME.getValue());

        System.out.println("Firm's income is " + Firm.getIncome()); // output: 34194

    }

}

package home.chapter06inheritance.task34;

/**
 * Раздел "Наследование и полиморфизм. Внутренние и
 * анонимные классы"
 * Задание №34
 *
 * Создать цепочку наследования (минимум 3 звена) классов, описывающих
 * должностную структуру на заводе. Реализовать методы по начислению зарплаты в
 * зависимости от должности (почасовая, процентная, смешанная). Иерархия должна
 * иметь хотя бы три уровня.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public abstract class Employee {

    private double baseSalary = Salary.BASE_SALARY.salary; // базовый оклад
    private double baseSalaryBonus = Bonus.BASE_SALARY_BONUS.bonus; // базовая премия от оклада
    private double baseIncomeBonus = Bonus.BASE_INCOME_BONUS.bonus; // базовая премия от дохода завода

    public double getSalaryBonus() {
        return baseSalaryBonus;
    }

    public double getIncomeBonus() {
        return baseIncomeBonus;
    }

    public double getSalary() {
        return baseSalary;
    }

    public abstract double getWage (); // формирует величину заработной платы

    public void printWage() {
        System.out.println(this.getWage());
    }
}

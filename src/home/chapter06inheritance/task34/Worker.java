package home.chapter06inheritance.task34;

public abstract class Worker extends Employee {

    private double workerSalary;
    private double workerSalaryBonus;

    public Worker() {
        workerSalary = super.getSalary() + Salary.WORKER_SALARY_ADDON.salary;
        workerSalaryBonus = super.getSalaryBonus() + Bonus.WORKER_SALARY_BONUS_ADDON.bonus;
    }

    @Override
    public double getSalary() {
        return workerSalary;
    }

    @Override
    public double getSalaryBonus() {
        return workerSalaryBonus;
    }

    public abstract double getWage();
}

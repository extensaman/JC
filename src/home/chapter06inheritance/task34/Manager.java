package home.chapter06inheritance.task34;

public abstract class Manager extends Employee{

    private double managerSalary;
    private double managerSalaryBonus;
    private double managerIncomeBonus;

    public Manager () {
        managerSalary = super.getSalary() + Salary.MANAGER_SALARY_ADDON.salary;
        managerSalaryBonus = super.getSalaryBonus() + Bonus.MANAGER_SALARY_BONUS_ADDON.bonus;
        managerIncomeBonus = super.getIncomeBonus() + Bonus.MANAGER_INCOME_BONUS.bonus;
    }

    @Override
    public double getSalary() {
        return managerSalary;
    }

    @Override
    public double getSalaryBonus() {
        return managerSalaryBonus;
    }

    @Override
    public double getIncomeBonus() {
        return managerIncomeBonus;
    }

    public abstract double getWage();
}

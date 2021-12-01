package home.chapter06inheritance.task34;

public enum Bonus {
    BASE_SALARY_BONUS (.0), // базовая премия к окладу
    BASE_INCOME_BONUS (0.0), // базовая премия от дохода завода

    CEO_INCOME_BONUS(.01),
    DIRECTOR_INCOME_BONUS_ADDON(.02),

    MANAGER_INCOME_BONUS (.0001),
    MANAGER_SALARY_BONUS_ADDON (0.1),
    HR_MANAGER_INCOME_BONUS_ADDON (.00001),
    HR_MANAGER_SALARY_BONUS_ADDON (.3),

    WORKER_SALARY_BONUS_ADDON (.0),
    DISIGNER_SALARY_BONUS_ADDON (0.2);

    public double bonus;
    Bonus (double bonus){
        this.bonus = bonus;
    }
}

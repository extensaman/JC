package home.chapter06inheritance.task34;

// оклад
public enum Salary {
    BASE_SALARY (800.0), // базовый оклад

    MANAGER_SALARY_ADDON (200.0), // добавка к окладу начальника
    HR_MANAGER_SALARY_ADDON (100.0), // дополнительная добавка к окладу начальника отдела кадров

    WORKER_SALARY_ADDON (200.0), // добавка к окладу работника
    DISIGNER_SALARY_ADDON (50.0); // дополнительная добавка к окладу дизайнера

    public double salary;
    Salary (double salary){
        this.salary = salary;
    }
}

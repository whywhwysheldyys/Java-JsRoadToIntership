package first_practice.oop02.composition.practice;

import first_practice.oop02.composition.interfaces.Workable;

public class Developer extends Employee implements Workable {
    private int salaryBonus;

    public Developer(String name, int baseSalary, int salaryBonus) {
        super(name, baseSalary);
        this.salaryBonus = salaryBonus;
    }

    @Override
    public void work() {
        System.out.println("Разработчик пишет код");
    }

    @Override
    public int calculateSalary() {
        return (baseSalary + salaryBonus);
    }
}
package second_practice.advanced03.oop02.inheritance.practice;

public class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        setBaseSalary(baseSalary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary <= 0) {
            System.out.println("Ошибка!Зарплата не может быть меньше либо равна нулю");
        } else {
            this.baseSalary = baseSalary;
        }
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void work() {
        System.out.println("Сотрудник работает");
    }
}
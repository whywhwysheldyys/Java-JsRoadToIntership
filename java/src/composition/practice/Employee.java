package composition.practice;

public abstract class Employee {
    private String name;
    int baseSalary;

    public Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract int calculateSalary();

    public void displayInfo() {
        System.out.println("Имя сотрудника:" + name);
    }
}
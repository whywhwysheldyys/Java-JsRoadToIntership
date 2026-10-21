package second_practice.oop02.inheritance.practice;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println("Сотрудник работает");
    }
}
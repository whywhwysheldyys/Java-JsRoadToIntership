package second_practice.advanced03.oop02.polymorphism.practice;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculateMonthlyPay() {
        return 0.0;
    }
}
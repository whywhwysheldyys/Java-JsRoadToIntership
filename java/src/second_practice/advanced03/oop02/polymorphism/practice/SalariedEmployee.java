package second_practice.advanced03.oop02.polymorphism.practice;

public class SalariedEmployee extends Employee{
    private double monthlySalary;

    public SalariedEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateMonthlyPay() {
        return monthlySalary;
    }
}
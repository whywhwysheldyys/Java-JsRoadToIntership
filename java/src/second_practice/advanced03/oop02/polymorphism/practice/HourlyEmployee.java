package second_practice.advanced03.oop02.polymorphism.practice;

public class HourlyEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateMonthlyPay() {
        return hourlyRate * hoursWorked;
    }
}
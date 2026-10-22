package second_practice.advanced03.oop02.polymorphism.practiceMain;

import second_practice.advanced03.oop02.polymorphism.practice.Employee;
import second_practice.advanced03.oop02.polymorphism.practice.HourlyEmployee;
import second_practice.advanced03.oop02.polymorphism.practice.SalariedEmployee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
                new HourlyEmployee("Oleg", 34.0, 45),
                new SalariedEmployee("Ilya", 1550.0)
        };

        for (Employee employee : employees) {
            System.out.println(employee.calculateMonthlyPay());
        }
    }
}
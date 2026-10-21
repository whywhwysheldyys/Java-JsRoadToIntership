package second_practice.oop02.abstractclass.practiceMain;

import second_practice.oop02.abstractclass.practice.Employee;
import second_practice.oop02.abstractclass.practice.HourlyEmployee;
import second_practice.oop02.abstractclass.practice.SalariedEmployee;

public class CompanyMain {
    public static void main(String[] args) {
        Employee[] employees = {
                new HourlyEmployee("Oleg", 32, 23.5, 34),
                new SalariedEmployee("Ivan", 45, 967.0)
        };

        for (Employee employee : employees) {
            System.out.println(employee.calculateSalary());
        }
    }
}
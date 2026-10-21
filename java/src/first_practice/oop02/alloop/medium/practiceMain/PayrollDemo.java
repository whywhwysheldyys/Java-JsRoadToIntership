package first_practice.oop02.alloop.medium.practiceMain;

import first_practice.oop02.alloop.medium.practice.Freelancer;
import first_practice.oop02.alloop.medium.practice.FullTimeEmployee;
import first_practice.oop02.alloop.medium.practice.HourlyEmployee;
import first_practice.oop02.alloop.medium.practiceAbstract.Employee;

import java.util.ArrayList;
import java.util.List;

public class PayrollDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new FullTimeEmployee("Oleg", "21", 1230.0),
                new HourlyEmployee("Ilya", "56", 10, 140),
                new Freelancer("Andrey", "54", 1567.7)
        ));

        for (Employee employee : employees) {
            System.out.println(employee.calculateSalary());
        }
    }
}
package second_practice.oop02.modifiers.practiceMain;

import second_practice.oop02.modifiers.practice.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Oleg", 345.5, "Builder");

        //employee.salary = 1234.4;
        //'salary' has private access in 'second_practice.oop02.modifiers.practice.Employee'
        employee.setSalary(1234.4);
        System.out.println(employee.getSalary());
    }
}
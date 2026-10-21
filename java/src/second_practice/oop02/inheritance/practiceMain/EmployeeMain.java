package second_practice.oop02.inheritance.practiceMain;

import second_practice.oop02.inheritance.practice.Employee;
import second_practice.oop02.inheritance.practice.Manager;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Oleg", 1234.4);
        Manager manager = new Manager("Olga", 1555.6,4);

        employee.work();
        manager.work();
    }
}
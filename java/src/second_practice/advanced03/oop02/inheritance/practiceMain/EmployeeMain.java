package second_practice.advanced03.oop02.inheritance.practiceMain;

import second_practice.advanced03.oop02.inheritance.practice.Developer;
import second_practice.advanced03.oop02.inheritance.practice.Manager;

public class EmployeeMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Ivan", 325, 4);
        Developer developer = new Developer("Sergey", 1000, "Java");

        manager.work();
        developer.work();

        System.out.println(manager.calculateSalary());
        System.out.println(developer.calculateSalary());
    }
}
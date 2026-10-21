package first_practice.oop02.composition.practiceMain;

import first_practice.oop02.composition.practice.Developer;

public class WorkersMain {
    public static void main(String[] args) {
        Developer developer = new Developer("Igor", 10_000, 1000);

        developer.work();
        developer.displayInfo();
        System.out.println(developer.calculateSalary());
    }
}
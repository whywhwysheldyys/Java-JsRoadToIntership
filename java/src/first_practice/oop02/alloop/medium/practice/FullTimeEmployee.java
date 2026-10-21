package first_practice.oop02.alloop.medium.practice;

import first_practice.oop02.alloop.medium.practiceAbstract.Employee;

public class FullTimeEmployee extends Employee {
        private double monthlySalary;

        public FullTimeEmployee(String name, String id, double monthlySalary) {
            super(name, id);
            this.monthlySalary = monthlySalary;
        }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
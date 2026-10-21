package first_practice.oop02.alloop.medium.practice;

import first_practice.oop02.alloop.medium.practiceAbstract.Employee;

public class HourlyEmployee extends Employee {
        private double hourlyRate;
        private int hoursWorked;

        public HourlyEmployee(String name, String id, double hourlyRate, int hoursWorked) {
            super(name, id);
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
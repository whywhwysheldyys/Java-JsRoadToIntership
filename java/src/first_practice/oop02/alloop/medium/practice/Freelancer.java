package first_practice.oop02.alloop.medium.practice;

import first_practice.oop02.alloop.medium.practiceAbstract.Employee;

public class Freelancer extends Employee {
        private double projectFee;

        public Freelancer(String name, String id, double projectFee) {
            super(name, id);
            this.projectFee = projectFee;
        }

    @Override
    public double calculateSalary() {
        return projectFee;
    }
}
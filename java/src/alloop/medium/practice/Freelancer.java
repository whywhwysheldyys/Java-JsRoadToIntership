package alloop.medium.practice;

import alloop.medium.practiceAbstract.Employee;

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
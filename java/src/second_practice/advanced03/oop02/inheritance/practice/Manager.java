package second_practice.advanced03.oop02.inheritance.practice;

public class Manager extends Employee{
    private int managedProjectsCount;

    public Manager(String name, double baseSalary, int managedProjectsCount) {
        super(name, baseSalary);
        this.managedProjectsCount = managedProjectsCount;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + managedProjectsCount * 500;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Менеджер управляет проектами");
    }
}
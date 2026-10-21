package second_practice.oop02.inheritance.practice;

public class Manager extends Employee{
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println("Менеджер управляет командой из " + teamSize + " человек");
    }
}
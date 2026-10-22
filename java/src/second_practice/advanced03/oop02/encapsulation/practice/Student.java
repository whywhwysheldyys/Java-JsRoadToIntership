package second_practice.advanced03.oop02.encapsulation.practice;

public class Student {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade < 0.0 || grade > 10.0) {
            System.out.println("Введите корректный балл!");
        } else {
            this.grade = grade;
        }
    }
}
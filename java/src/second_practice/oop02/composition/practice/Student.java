package second_practice.oop02.composition.practice;

public class Student {
    private String name;
    private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Имя студента: " + name + ", id: " + studentId;
    }
}
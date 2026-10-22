package second_practice.advanced03.oop02.encapsulation.practiceMain;

import second_practice.advanced03.oop02.encapsulation.practice.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Igor", 10.2);

        System.out.println(student.getGrade());
    }
}
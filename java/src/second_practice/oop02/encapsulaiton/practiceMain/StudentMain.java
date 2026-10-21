package second_practice.oop02.encapsulaiton.practiceMain;

import second_practice.oop02.encapsulaiton.practice.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student[] studentsArray = {
                new Student("Oleg", 2, 3.4),
                new Student("Andrey", 1, 4.6),
                new Student("Ivan", 3, 3.4)
        };

        for (Student student : studentsArray) {
            System.out.println(student.toString());
        }
    }
}
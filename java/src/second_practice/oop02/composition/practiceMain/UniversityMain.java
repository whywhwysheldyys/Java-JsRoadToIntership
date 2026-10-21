package second_practice.oop02.composition.practiceMain;

import second_practice.oop02.composition.practice.Student;
import second_practice.oop02.composition.practice.University;

public class UniversityMain {
    public static void main(String[] args) {
        Student firstStudent = new Student("Oleg", 43);
        Student secondStudent = new Student("Anna", 23);
        Student thirdStudent = new Student("Ivan", 76);

        Student[] students = {firstStudent, secondStudent, thirdStudent};

        University brgty = new University("BRGTY", students);

        brgty.printStudents();
    }
}
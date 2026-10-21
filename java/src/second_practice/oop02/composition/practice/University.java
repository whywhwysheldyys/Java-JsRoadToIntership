package second_practice.oop02.composition.practice;

public class University {
    private String universityName;
    private Student[] students;

    public University(String universityName, Student[] students) {
        this.universityName = universityName;
        this.students = students;
    }

    public void printStudents() {
        System.out.println("Название университета: " + universityName);

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}